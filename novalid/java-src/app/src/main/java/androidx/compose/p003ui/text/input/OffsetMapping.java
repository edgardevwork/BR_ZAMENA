package androidx.compose.p003ui.text.input;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OffsetMapping.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/text/input/OffsetMapping;", "", "originalToTransformed", "", TypedValues.CycleType.S_WAVE_OFFSET, "transformedToOriginal", "Companion", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface OffsetMapping {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    int originalToTransformed(int offset);

    int transformedToOriginal(int offset);

    /* compiled from: OffsetMapping.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/ui/text/input/OffsetMapping$Companion;", "", "()V", "Identity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final OffsetMapping Identity = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.p003ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return offset;
            }

            @Override // androidx.compose.p003ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                return offset;
            }
        };

        private Companion() {
        }

        @NotNull
        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }
}
