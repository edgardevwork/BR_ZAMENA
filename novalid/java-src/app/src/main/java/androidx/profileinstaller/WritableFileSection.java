package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class WritableFileSection {
    public final byte[] mContents;
    public final int mExpectedInflateSize;
    public final boolean mNeedsCompression;
    public final FileSectionType mType;

    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i, @NonNull byte[] bArr, boolean z) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i;
        this.mContents = bArr;
        this.mNeedsCompression = z;
    }
}
