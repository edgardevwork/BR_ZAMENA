package org.apache.commons.compress.archivers.zip;

import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;

/* loaded from: classes5.dex */
public class ScatterStatistics {
    public final long compressionElapsed;
    public final long mergingElapsed;

    public ScatterStatistics(long j, long j2) {
        this.compressionElapsed = j;
        this.mergingElapsed = j2;
    }

    public long getCompressionElapsed() {
        return this.compressionElapsed;
    }

    public long getMergingElapsed() {
        return this.mergingElapsed;
    }

    public String toString() {
        return "compressionElapsed=" + this.compressionElapsed + "ms, mergingElapsed=" + this.mergingElapsed + UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY;
    }
}
