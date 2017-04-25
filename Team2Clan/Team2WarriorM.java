package Team2Clan;

import java.util.ArrayList;

import static clanmelee.ClanMember.ClanMemberType.WARRIOR;

public class Team2WarriorM extends clanmelee.Clan
{

    public Team2WarriorM(int clanID)
    {
        super("Team 2 Warrior", clanID);
    }

    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints)
    {
        ArrayList<clanmelee.ClanMember> clanMembers = new ArrayList<>();

        clanmelee.ActionPointDecider decider = new Team2WarriorD(10);

        int adjHitPoints = (hitPoints);
        while (adjHitPoints > 0)
        {
            int nextHP = 1000;
            if (adjHitPoints < 1000)
            {
                nextHP = adjHitPoints;
            }

            clanMembers.add(new clanmelee.ClanMember(getClanID(), WARRIOR, nextHP, decider));
            adjHitPoints -= nextHP;
        }
        return clanMembers;
    }
}
