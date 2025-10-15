package androidx.compose.p003ui.tooling.preview.datasource;

import androidx.compose.p003ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionPreviewParameterProvider.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m7105d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "collection", "", "(Ljava/util/Collection;)V", SavedStateHandle.VALUES, "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "ui-tooling-preview_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;

    @NotNull
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(@NotNull Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.p003ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<T> getValues() {
        return CollectionsKt___CollectionsKt.asSequence(this.collection);
    }
}
