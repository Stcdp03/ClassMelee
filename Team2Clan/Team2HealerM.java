package Team2Clan;

import java.util.ArrayList;

import static clanmelee.ClanMember.ClanMemberType.HEALER;

public class Team2HealerM extends clanmelee.Clan
{

    public Team2HealerM(int clanID)
    {
        super("Team 2 Healer", clanID);
    }

    @Override
    public ArrayList<clanmelee.ClanMember> getClanMembers(int hitPoints) {
        ArrayList<clanmelee.ClanMember> clanMembers = new ArrayList<>();


        clanmelee.ActionPointDecider decider = new Team2HealerD(10);

        int adjHitPoints = 0;
        while (adjHitPoints > 0)
        {
            int nextHP = 1;
            if (adjHitPoints < 1)
            {
                nextHP = adjHitPoints;
            }

            clanMembers.add(new clanmelee.ClanMember(getClanID(), HEALER, nextHP, decider));
            adjHitPoints -= nextHP;
        }
        return clanMembers;
    }
}
