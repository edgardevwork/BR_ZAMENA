package androidx.compose.p003ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VectorResources.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u0086\u0002R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "()V", "map", "Ljava/util/HashMap;", "Landroidx/compose/ui/res/ImageVectorCache$Key;", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "Lkotlin/collections/HashMap;", "clear", "", "get", "key", "prune", "configChanges", "", "set", "imageVectorEntry", "ImageVectorEntry", "Key", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ImageVectorCache {
    public static final int $stable = 8;

    @NotNull
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003R\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003R\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "id", "", "(Landroid/content/res/Resources$Theme;I)V", "getId", "()I", "getTheme", "()Landroid/content/res/Resources$Theme;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final /* data */ class Key {
        public static final int $stable = 8;
        private final int id;

        @NotNull
        private final Resources.Theme theme;

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                theme = key.theme;
            }
            if ((i2 & 2) != 0) {
                i = key.id;
            }
            return key.copy(theme, i);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Resources.Theme getTheme() {
            return this.theme;
        }

        /* renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        public final Key copy(@NotNull Resources.Theme theme, int id) {
            return new Key(theme, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.theme, key.theme) && this.id == key.id;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.id + ')';
        }

        public Key(@NotNull Resources.Theme theme, int i) {
            this.theme = theme;
            this.id = i;
        }

        @NotNull
        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: VectorResources.android.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "configFlags", "", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "getConfigFlags", "()I", "getImageVector", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final /* data */ class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;

        @NotNull
        private final ImageVector imageVector;

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i2 & 2) != 0) {
                i = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        /* renamed from: component2, reason: from getter */
        public final int getConfigFlags() {
            return this.configFlags;
        }

        @NotNull
        public final ImageVectorEntry copy(@NotNull ImageVector imageVector, int configFlags) {
            return new ImageVectorEntry(imageVector, configFlags);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) other;
            return Intrinsics.areEqual(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        @NotNull
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }

        public ImageVectorEntry(@NotNull ImageVector imageVector, int i) {
            this.imageVector = imageVector;
            this.configFlags = i;
        }

        @NotNull
        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }
    }

    @Nullable
    public final ImageVectorEntry get(@NotNull Key key) {
        WeakReference<ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int configChanges) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(configChanges, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(@NotNull Key key, @NotNull ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }

    public final void clear() {
        this.map.clear();
    }
}
