package rabbitescape.ui.android;

import rabbitescape.engine.LevelWinListener;
import rabbitescape.engine.Token;
import rabbitescape.engine.World;

public class Physics
{
    public int frame;
    public final World world;
    private final rabbitescape.render.Physics impl;

    public Physics( World world, LevelWinListener winListener )
    {
        this.frame = 0;
        this.world = world;
        this.impl = new rabbitescape.render.Physics( world, winListener );
    }

    public void step()
    {
        ++frame;

        if ( frame == 10 )
        {
            frame = 0;
            impl.step();
        }
    }

    public boolean gameRunning()
    {
        return impl.gameRunning();
    }

    public int addToken( int tileX, int tileY, Token.Type ability )
    {
        return impl.addToken( tileX, tileY, ability);
    }
}
