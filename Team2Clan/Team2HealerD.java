package Team2Clan;


public class Team2HealerD implements clanmelee.ActionPointDecider
{
    private int actionPoints;

    public Team2HealerD(int actionPoints)
    {
        this.actionPoints = actionPoints;
    }

    @Override
    public int decideActionPoints(clanmelee.ClanMember me, clanmelee.ClanMember other)
    {
        return 0;

    }
}