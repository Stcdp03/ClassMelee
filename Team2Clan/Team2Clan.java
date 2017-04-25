package Team2Clan;

import java.util.ArrayList;

public class Team2Clan extends clanmelee.Clan
{

    public Team2Clan(int clanID)
    {
        super("Team 2 Clan", clanID);
    }
    /**
     * This class serves as the main factory which brings together all clan member types into a final list.
     */
    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints)
    {
        ArrayList<clanmelee.ClanMember> fullClanMembers = new ArrayList<>();

        Team2WarriorM Warrior = new Team2WarriorM(getClanID());
        Team2HealerM Healer = new Team2HealerM(getClanID());

        fullClanMembers.addAll(Warrior.getClanMembers(hitPoints));
        fullClanMembers.addAll(Healer.getClanMembers(hitPoints));

        return fullClanMembers;
    }
}