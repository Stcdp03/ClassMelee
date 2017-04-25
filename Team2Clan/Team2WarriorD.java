package Team2Clan;


public class Team2WarriorD implements clanmelee.ActionPointDecider
{
    private int actionPoints;

    public Team2WarriorD(int actionPoints)
    {
        this.actionPoints = actionPoints;
    }

    @Override
    public int decideActionPoints(clanmelee.ClanMember me, clanmelee.ClanMember other) {
        boolean clanIDsMatch = me.getClanID() == other.getClanID();

        if (!clanIDsMatch)
        {
            // other.dealIterationDamage(other.getMaxHitPoints() * 2);
            return actionPoints;
        }
        else
        {
            return 0;
        }
    }
}
