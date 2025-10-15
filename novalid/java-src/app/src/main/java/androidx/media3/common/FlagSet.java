package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@UnstableApi
/* loaded from: classes4.dex */
public final class FlagSet {
    public final SparseBooleanArray flags;

    public /* synthetic */ FlagSet(SparseBooleanArray sparseBooleanArray, C27371 c27371) {
        this(sparseBooleanArray);
    }

    public static final class Builder {
        public boolean buildCalled;
        public final SparseBooleanArray flags = new SparseBooleanArray();

        @CanIgnoreReturnValue
        public Builder add(int i) {
            Assertions.checkState(!this.buildCalled);
            this.flags.append(i, true);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(FlagSet flagSet) {
            for (int i = 0; i < flagSet.size(); i++) {
                add(flagSet.get(i));
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder remove(int i) {
            Assertions.checkState(!this.buildCalled);
            this.flags.delete(i);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeIf(int i, boolean z) {
            return z ? remove(i) : this;
        }

        @CanIgnoreReturnValue
        public Builder removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        public FlagSet build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }
    }

    public FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean contains(int i) {
        return this.flags.get(i);
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.flags.size();
    }

    public int get(int i) {
        Assertions.checkIndex(i, 0, size());
        return this.flags.keyAt(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Util.SDK_INT < 24) {
            if (size() != flagSet.size()) {
                return false;
            }
            for (int i = 0; i < size(); i++) {
                if (get(i) != flagSet.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.flags.equals(flagSet.flags);
    }

    public int hashCode() {
        if (Util.SDK_INT < 24) {
            int size = size();
            for (int i = 0; i < size(); i++) {
                size = (size * 31) + get(i);
            }
            return size;
        }
        return this.flags.hashCode();
    }
}
