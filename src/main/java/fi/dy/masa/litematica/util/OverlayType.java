package fi.dy.masa.litematica.util;

public enum OverlayType
{
    NONE        (0),
    MISSING     (1),
    MISSING_HOLDING (2),
    EXTRA       (3),
    WRONG_STATE (4),
    WRONG_BLOCK (5);

    private final int priority;

    private OverlayType(int priority)
    {
        this.priority = priority;
    }

    /**
     * Higher value means higher render priority over an overlapping lower priority
     * @return
     */
    public int getRenderPriority()
    {
        return this.priority;
    }
}
