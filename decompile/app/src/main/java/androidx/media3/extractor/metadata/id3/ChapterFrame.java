package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: androidx.media3.extractor.metadata.id3.ChapterFrame.1
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f323ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    public final Id3Frame[] subFrames;

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(f323ID);
        this.chapterId = str;
        this.startTimeMs = i;
        this.endTimeMs = i2;
        this.startOffset = j;
        this.endOffset = j2;
        this.subFrames = id3FrameArr;
    }

    public ChapterFrame(Parcel parcel) {
        super(f323ID);
        this.chapterId = (String) Util.castNonNull(parcel.readString());
        this.startTimeMs = parcel.readInt();
        this.endTimeMs = parcel.readInt();
        this.startOffset = parcel.readLong();
        this.endOffset = parcel.readLong();
        int i = parcel.readInt();
        this.subFrames = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.subFrames[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public Id3Frame getSubFrame(int i) {
        return this.subFrames[i];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && Util.areEqual(this.chapterId, chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames);
    }

    public int hashCode() {
        int i = (((((((527 + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31;
        String str = this.chapterId;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.chapterId);
        parcel.writeInt(this.startTimeMs);
        parcel.writeInt(this.endTimeMs);
        parcel.writeLong(this.startOffset);
        parcel.writeLong(this.endOffset);
        parcel.writeInt(this.subFrames.length);
        for (Id3Frame id3Frame : this.subFrames) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    /* renamed from: androidx.media3.extractor.metadata.id3.ChapterFrame$1 */
    /* loaded from: classes2.dex */
    public class C29501 implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }
}
