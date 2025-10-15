package org.apache.commons.compress.archivers.sevenz;

/* loaded from: classes5.dex */
public class StreamMap {
    public int[] fileFolderIndex;
    public int[] folderFirstFileIndex;
    public int[] folderFirstPackStreamIndex;
    public long[] packStreamOffsets;

    public String toString() {
        return "StreamMap with indices of " + this.folderFirstPackStreamIndex.length + " folders, offsets of " + this.packStreamOffsets.length + " packed streams, first files of " + this.folderFirstFileIndex.length + " folders and folder indices for " + this.fileFolderIndex.length + " files";
    }
}
