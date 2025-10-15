package androidx.compose.animation;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "", "init", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "animation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface GraphicsLayerBlockForEnterExit {
    @NotNull
    Function1<GraphicsLayerScope, Unit> init();
}
