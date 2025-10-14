package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Button.kt */
@Metadata(m7104d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, m7105d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1068:1\n1116#2,6:1069\n1116#2,6:1077\n1116#2,6:1083\n1116#2,6:1089\n1116#2,6:1095\n154#3:1075\n154#3:1076\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n*L\n113#1:1069,6\n204#1:1077,6\n274#1:1083,6\n343#1:1089,6\n414#1:1095,6\n118#1:1075\n119#1:1076\n*E\n"})
/* loaded from: classes3.dex */
public final class ButtonKt {

    /* compiled from: Button.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$Button$4 */
    /* loaded from: classes2.dex */
    public static final class C13434 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ButtonColors $colors;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ ButtonElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13434(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ButtonKt.Button(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Button.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$ElevatedButton$2 */
    /* loaded from: classes2.dex */
    public static final class C13442 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ButtonColors $colors;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ ButtonElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13442(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ButtonKt.ElevatedButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Button.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$FilledTonalButton$2 */
    /* loaded from: classes2.dex */
    public static final class C13452 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ButtonColors $colors;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ ButtonElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13452(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ButtonKt.FilledTonalButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Button.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$OutlinedButton$2 */
    /* loaded from: classes2.dex */
    public static final class C13462 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ButtonColors $colors;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ ButtonElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13462(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ButtonKt.OutlinedButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Button.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$TextButton$2 */
    /* loaded from: classes2.dex */
    public static final class C13472 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ButtonColors $colors;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ ButtonElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13472(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            buttonColors = buttonColors;
            buttonElevation = buttonElevation;
            borderStroke = borderStroke;
            paddingValues = paddingValues;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ButtonKt.TextButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable ButtonColors buttonColors, @Nullable ButtonElevation buttonElevation, @Nullable BorderStroke borderStroke, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevationM9167buttonElevationR_JCAzs;
        int i5;
        int i6;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        int i9;
        ButtonColors buttonColors3;
        BorderStroke borderStroke2;
        int i10;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues2;
        int i11;
        Modifier modifier2;
        boolean z2;
        Composer composer2;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        ButtonElevation buttonElevation2;
        boolean z3;
        BorderStroke borderStroke4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(650121315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i13 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i14 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevationM9167buttonElevationR_JCAzs = buttonElevation;
                        int i15 = composerStartRestartGroup.changed(buttonElevationM9167buttonElevationR_JCAzs) ? 131072 : 65536;
                        i3 |= i15;
                    } else {
                        buttonElevationM9167buttonElevationR_JCAzs = buttonElevation;
                    }
                    i3 |= i15;
                } else {
                    buttonElevationM9167buttonElevationR_JCAzs = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                        if ((i & 100663296) == 0) {
                            i8 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        if ((306783379 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            shape4 = shape2;
                            buttonElevation2 = buttonElevationM9167buttonElevationR_JCAzs;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            composer2 = composerStartRestartGroup;
                            borderStroke4 = borderStroke;
                            paddingValues3 = paddingValues;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z;
                                if ((i2 & 8) == 0) {
                                    i3 &= -7169;
                                    shape3 = ButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 16) == 0) {
                                    i9 = i3 & (-57345);
                                    buttonColors3 = ButtonDefaults.INSTANCE.buttonColors(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i3;
                                    buttonColors3 = buttonColors2;
                                }
                                if ((i2 & 32) == 0) {
                                    borderStroke2 = null;
                                    buttonElevationM9167buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m9167buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 31);
                                    i10 = i9 & (-458753);
                                } else {
                                    borderStroke2 = null;
                                    i10 = i9;
                                }
                                borderStroke3 = i5 == 0 ? borderStroke2 : borderStroke;
                                PaddingValues contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(823568939);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    i11 = i10;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    z2 = z4;
                                    shape2 = shape3;
                                    buttonColors2 = buttonColors3;
                                    paddingValues2 = contentPadding;
                                    modifier2 = modifier4;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    paddingValues2 = contentPadding;
                                    i11 = i10;
                                    modifier2 = modifier4;
                                    z2 = z4;
                                    shape2 = shape3;
                                    buttonColors2 = buttonColors3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                borderStroke3 = borderStroke;
                                paddingValues2 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i11 = i3;
                                z2 = z;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(650121315, i11, -1, "androidx.compose.material3.Button (Button.kt:114)");
                            }
                            long jM9159containerColorvNxB06k$material3_release = buttonColors2.m9159containerColorvNxB06k$material3_release(z2);
                            long jM9160contentColorvNxB06k$material3_release = buttonColors2.m9160contentColorvNxB06k$material3_release(z2);
                            composerStartRestartGroup.startReplaceableGroup(823569174);
                            State<C2046Dp> stateShadowElevation$material3_release = buttonElevationM9167buttonElevationR_JCAzs != null ? null : buttonElevationM9167buttonElevationR_JCAzs.shadowElevation$material3_release(z2, mutableInteractionSource3, composerStartRestartGroup, ((i11 >> 6) & 14) | ((i11 >> 21) & 112) | ((i11 >> 9) & 896));
                            composerStartRestartGroup.endReplaceableGroup();
                            ButtonColors buttonColors4 = buttonColors2;
                            int i16 = (i11 & 8078) | ((i11 << 6) & 234881024) | ((i11 << 3) & 1879048192);
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m9879Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier2, false, C13412.INSTANCE, 1, null), z2, shape2, jM9159containerColorvNxB06k$material3_release, jM9160contentColorvNxB06k$material3_release, buttonElevationM9167buttonElevationR_JCAzs == null ? buttonElevationM9167buttonElevationR_JCAzs.m9178tonalElevationu2uoSUM$material3_release(z2) : C2046Dp.m13666constructorimpl(0), stateShadowElevation$material3_release == null ? stateShadowElevation$material3_release.getValue().m13680unboximpl() : C2046Dp.m13666constructorimpl(0), borderStroke3, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ long $contentColor;
                                public final /* synthetic */ PaddingValues $contentPadding;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13423(long jM9160contentColorvNxB06k$material3_release2, PaddingValues paddingValues22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                    super(2);
                                    j = jM9160contentColorvNxB06k$material3_release2;
                                    paddingValues = paddingValues22;
                                    function3 = function32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(956488494, i17, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:131)");
                                        }
                                        ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge(), ComposableLambdaKt.composableLambda(composer3, 1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3.1
                                            public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                                super(2);
                                                function3 = function32;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i18) {
                                                if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m8156defaultMinSizeVpY3zN4(companion, buttonDefaults.m9175getMinWidthD9Ej5fM(), buttonDefaults.m9174getMinHeightD9Ej5fM()), paddingValues);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    composer4.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    function32.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* compiled from: Button.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1068:1\n91#2,2:1069\n93#2:1099\n97#2:1104\n78#3,11:1071\n91#3:1103\n456#4,8:1082\n464#4,3:1096\n467#4,3:1100\n3737#5,6:1090\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n*L\n135#1:1069,2\n135#1:1099\n135#1:1104\n135#1:1071,11\n135#1:1103\n135#1:1082,8\n135#1:1096,3\n135#1:1100,3\n135#1:1090,6\n*E\n"})
                                /* renamed from: androidx.compose.material3.ButtonKt$Button$3$1 */
                                public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                        super(2);
                                        function3 = function32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i18) {
                                        if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m8156defaultMinSizeVpY3zN4(companion, buttonDefaults.m9175getMinWidthD9Ej5fM(), buttonDefaults.m9174getMinHeightD9Ej5fM()), paddingValues);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                            composer4.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            function32.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }), composer2, i16, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            buttonColors2 = buttonColors4;
                            paddingValues3 = paddingValues22;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape2;
                            buttonElevation2 = buttonElevationM9167buttonElevationR_JCAzs;
                            z3 = z2;
                            borderStroke4 = borderStroke3;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.4
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ButtonColors $colors;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ ButtonElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13434(Function0<Unit> function02, Modifier modifier32, boolean z32, Shape shape42, ButtonColors buttonColors22, ButtonElevation buttonElevation22, BorderStroke borderStroke42, PaddingValues paddingValues32, MutableInteractionSource mutableInteractionSource42, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i17, int i22) {
                                    super(2);
                                    function0 = function02;
                                    modifier = modifier32;
                                    z = z32;
                                    shape = shape42;
                                    buttonColors = buttonColors22;
                                    buttonElevation = buttonElevation22;
                                    borderStroke = borderStroke42;
                                    paddingValues = paddingValues32;
                                    mutableInteractionSource = mutableInteractionSource42;
                                    function3 = function32;
                                    i = i17;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    ButtonKt.Button(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i8 = i7;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i22 & 512) != 0) {
                    }
                    if ((306783379 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i17 & 1) != 0) {
                            if (i12 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 8) == 0) {
                            }
                            if ((i22 & 16) == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            long jM9159containerColorvNxB06k$material3_release2 = buttonColors22.m9159containerColorvNxB06k$material3_release(z2);
                            long jM9160contentColorvNxB06k$material3_release2 = buttonColors22.m9160contentColorvNxB06k$material3_release(z2);
                            composerStartRestartGroup.startReplaceableGroup(823569174);
                            if (buttonElevationM9167buttonElevationR_JCAzs != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ButtonColors buttonColors42 = buttonColors22;
                            int i162 = (i11 & 8078) | ((i11 << 6) & 234881024) | ((i11 << 3) & 1879048192);
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m9879Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(modifier2, false, C13412.INSTANCE, 1, null), z2, shape2, jM9159containerColorvNxB06k$material3_release2, jM9160contentColorvNxB06k$material3_release2, buttonElevationM9167buttonElevationR_JCAzs == null ? buttonElevationM9167buttonElevationR_JCAzs.m9178tonalElevationu2uoSUM$material3_release(z2) : C2046Dp.m13666constructorimpl(0), stateShadowElevation$material3_release == null ? stateShadowElevation$material3_release.getValue().m13680unboximpl() : C2046Dp.m13666constructorimpl(0), borderStroke3, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ long $contentColor;
                                public final /* synthetic */ PaddingValues $contentPadding;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13423(long jM9160contentColorvNxB06k$material3_release22, PaddingValues paddingValues22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                    super(2);
                                    j = jM9160contentColorvNxB06k$material3_release22;
                                    paddingValues = paddingValues22;
                                    function3 = function32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(956488494, i17, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:131)");
                                        }
                                        ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge(), ComposableLambdaKt.composableLambda(composer3, 1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3.1
                                            public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                                super(2);
                                                function3 = function32;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i18) {
                                                if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m8156defaultMinSizeVpY3zN4(companion, buttonDefaults.m9175getMinWidthD9Ej5fM(), buttonDefaults.m9174getMinHeightD9Ej5fM()), paddingValues);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    composer4.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    function32.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* compiled from: Button.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1068:1\n91#2,2:1069\n93#2:1099\n97#2:1104\n78#3,11:1071\n91#3:1103\n456#4,8:1082\n464#4,3:1096\n467#4,3:1100\n3737#5,6:1090\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n*L\n135#1:1069,2\n135#1:1099\n135#1:1104\n135#1:1071,11\n135#1:1103\n135#1:1082,8\n135#1:1096,3\n135#1:1100,3\n135#1:1090,6\n*E\n"})
                                /* renamed from: androidx.compose.material3.ButtonKt$Button$3$1 */
                                public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                                        super(2);
                                        function3 = function32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i18) {
                                        if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m8156defaultMinSizeVpY3zN4(companion, buttonDefaults.m9175getMinWidthD9Ej5fM(), buttonDefaults.m9174getMinHeightD9Ej5fM()), paddingValues);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                            composer4.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            function32.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }), composer2, i162, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            buttonColors22 = buttonColors42;
                            paddingValues32 = paddingValues22;
                            mutableInteractionSource42 = mutableInteractionSource3;
                            shape42 = shape2;
                            buttonElevation22 = buttonElevationM9167buttonElevationR_JCAzs;
                            z32 = z2;
                            borderStroke42 = borderStroke3;
                            modifier32 = modifier2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i6 = i22 & 128;
                if (i6 == 0) {
                }
                i7 = i22 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i22 & 512) != 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i17 & 3072) == 0) {
            }
            if ((i17 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i17) == 0) {
            }
            i5 = i22 & 64;
            if (i5 != 0) {
            }
            i6 = i22 & 128;
            if (i6 == 0) {
            }
            i7 = i22 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i22 & 512) != 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        if ((i17 & 3072) == 0) {
        }
        if ((i17 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i17) == 0) {
        }
        i5 = i22 & 64;
        if (i5 != 0) {
        }
        i6 = i22 & 128;
        if (i6 == 0) {
        }
        i7 = i22 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i22 & 512) != 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: Button.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$Button$2 */
    /* loaded from: classes2.dex */
    public static final class C13412 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C13412 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12993getButtono7Vup1c());
        }
    }

    /* compiled from: Button.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$Button$3 */
    /* loaded from: classes2.dex */
    public static final class C13423 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ long $contentColor;
        public final /* synthetic */ PaddingValues $contentPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13423(long jM9160contentColorvNxB06k$material3_release22, PaddingValues paddingValues22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
            super(2);
            j = jM9160contentColorvNxB06k$material3_release22;
            paddingValues = paddingValues22;
            function3 = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
            invoke(composer3, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer3, int i17) {
            if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(956488494, i17, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:131)");
                }
                ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge(), ComposableLambdaKt.composableLambda(composer3, 1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3.1
                    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                        super(2);
                        function3 = function32;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer4, int i18) {
                        if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m8156defaultMinSizeVpY3zN4(companion, buttonDefaults.m9175getMinWidthD9Ej5fM(), buttonDefaults.m9174getMinHeightD9Ej5fM()), paddingValues);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            composer4.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                            composer4.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            function32.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                }), composer3, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer3.skipToGroupEnd();
        }

        /* compiled from: Button.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1068:1\n91#2,2:1069\n93#2:1099\n97#2:1104\n78#3,11:1071\n91#3:1103\n456#4,8:1082\n464#4,3:1096\n467#4,3:1100\n3737#5,6:1090\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n*L\n135#1:1069,2\n135#1:1099\n135#1:1104\n135#1:1071,11\n135#1:1103\n135#1:1082,8\n135#1:1096,3\n135#1:1100,3\n135#1:1090,6\n*E\n"})
        /* renamed from: androidx.compose.material3.ButtonKt$Button$3$1 */
        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32) {
                super(2);
                function3 = function32;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer4, int i18) {
                if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1327513942, i18, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m8156defaultMinSizeVpY3zN4(companion, buttonDefaults.m9175getMinWidthD9Ej5fM(), buttonDefaults.m9174getMinHeightD9Ej5fM()), paddingValues);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    composer4.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                    composer4.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                    if (!(composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                    composer4.startReplaceableGroup(2058660585);
                    function32.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                    composer4.endReplaceableGroup();
                    composer4.endNode();
                    composer4.endReplaceableGroup();
                    composer4.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer4.skipToGroupEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable ButtonColors buttonColors, @Nullable ButtonElevation buttonElevation, @Nullable BorderStroke borderStroke, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevationM9169elevatedButtonElevationR_JCAzs;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape elevatedShape;
        int i9;
        ButtonColors buttonColorsElevatedButtonColors;
        PaddingValues contentPadding;
        int i10;
        BorderStroke borderStroke3;
        boolean z3;
        Shape shape3;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke4;
        PaddingValues paddingValues2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1466887385);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i12 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i13 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i13;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevationM9169elevatedButtonElevationR_JCAzs = buttonElevation;
                        int i14 = composerStartRestartGroup.changed(buttonElevationM9169elevatedButtonElevationR_JCAzs) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        buttonElevationM9169elevatedButtonElevationR_JCAzs = buttonElevation;
                    }
                    i3 |= i14;
                } else {
                    buttonElevationM9169elevatedButtonElevationR_JCAzs = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((1572864 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i8 = i7;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z2;
                            shape3 = shape2;
                            buttonColors3 = buttonColors2;
                            buttonElevation2 = buttonElevationM9169elevatedButtonElevationR_JCAzs;
                            borderStroke4 = borderStroke2;
                            paddingValues2 = paddingValues;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i11 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z2;
                                if ((i2 & 8) == 0) {
                                    i3 &= -7169;
                                    elevatedShape = ButtonDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                                } else {
                                    elevatedShape = shape2;
                                }
                                if ((i2 & 16) == 0) {
                                    i9 = i3 & (-57345);
                                    buttonColorsElevatedButtonColors = ButtonDefaults.INSTANCE.elevatedButtonColors(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i3;
                                    buttonColorsElevatedButtonColors = buttonColors2;
                                }
                                if ((i2 & 32) == 0) {
                                    buttonElevationM9169elevatedButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m9169elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 31);
                                    i3 = i9 & (-458753);
                                } else {
                                    i3 = i9;
                                }
                                if (i5 != 0) {
                                    borderStroke2 = null;
                                }
                                contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-446997561);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    z2 = z4;
                                    shape2 = elevatedShape;
                                    buttonColors2 = buttonColorsElevatedButtonColors;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i10 = i3;
                                    borderStroke3 = borderStroke2;
                                    z2 = z4;
                                    shape2 = elevatedShape;
                                    buttonColors2 = buttonColorsElevatedButtonColors;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1466887385, i10, -1, "androidx.compose.material3.ElevatedButton (Button.kt:206)");
                                    }
                                    Button(function0, modifier2, z2, shape2, buttonColors2, buttonElevationM9169elevatedButtonElevationR_JCAzs, borderStroke3, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i10 & 2147483646, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z3 = z2;
                                    shape3 = shape2;
                                    buttonColors3 = buttonColors2;
                                    buttonElevation2 = buttonElevationM9169elevatedButtonElevationR_JCAzs;
                                    borderStroke4 = borderStroke3;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                contentPadding = paddingValues;
                            }
                            i10 = i3;
                            borderStroke3 = borderStroke2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Button(function0, modifier2, z2, shape2, buttonColors2, buttonElevationM9169elevatedButtonElevationR_JCAzs, borderStroke3, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i10 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z3 = z2;
                            shape3 = shape2;
                            buttonColors3 = buttonColors2;
                            buttonElevation2 = buttonElevationM9169elevatedButtonElevationR_JCAzs;
                            borderStroke4 = borderStroke3;
                            paddingValues2 = contentPadding;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.ElevatedButton.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ButtonColors $colors;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ ButtonElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13442(Function0<Unit> function02, Modifier modifier32, boolean z32, Shape shape32, ButtonColors buttonColors32, ButtonElevation buttonElevation22, BorderStroke borderStroke42, PaddingValues paddingValues22, MutableInteractionSource mutableInteractionSource22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i15, int i22) {
                                    super(2);
                                    function0 = function02;
                                    modifier = modifier32;
                                    z = z32;
                                    shape = shape32;
                                    buttonColors = buttonColors32;
                                    buttonElevation = buttonElevation22;
                                    borderStroke = borderStroke42;
                                    paddingValues = paddingValues22;
                                    mutableInteractionSource = mutableInteractionSource22;
                                    function3 = function32;
                                    i = i15;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ButtonKt.ElevatedButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i15 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 8) == 0) {
                            }
                            if ((i22 & 16) == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i7;
                mutableInteractionSource22 = mutableInteractionSource;
                if ((i22 & 512) != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i15 & 3072) == 0) {
            }
            if ((i15 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i15) == 0) {
            }
            i5 = i22 & 64;
            if (i5 != 0) {
            }
            i6 = i22 & 128;
            if (i6 != 0) {
            }
            i7 = i22 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource22 = mutableInteractionSource;
            if ((i22 & 512) != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i15 & 3072) == 0) {
        }
        if ((i15 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i15) == 0) {
        }
        i5 = i22 & 64;
        if (i5 != 0) {
        }
        i6 = i22 & 128;
        if (i6 != 0) {
        }
        i7 = i22 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource22 = mutableInteractionSource;
        if ((i22 & 512) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable ButtonColors buttonColors, @Nullable ButtonElevation buttonElevation, @Nullable BorderStroke borderStroke, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevationM9171filledTonalButtonElevationR_JCAzs;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape filledTonalShape;
        int i9;
        ButtonColors buttonColorsFilledTonalButtonColors;
        PaddingValues contentPadding;
        int i10;
        BorderStroke borderStroke3;
        boolean z3;
        Shape shape3;
        ButtonColors buttonColors3;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke4;
        PaddingValues paddingValues2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1717924381);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i12 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i13 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i13;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevationM9171filledTonalButtonElevationR_JCAzs = buttonElevation;
                        int i14 = composerStartRestartGroup.changed(buttonElevationM9171filledTonalButtonElevationR_JCAzs) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        buttonElevationM9171filledTonalButtonElevationR_JCAzs = buttonElevation;
                    }
                    i3 |= i14;
                } else {
                    buttonElevationM9171filledTonalButtonElevationR_JCAzs = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((1572864 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i8 = i7;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z2;
                            shape3 = shape2;
                            buttonColors3 = buttonColors2;
                            buttonElevation2 = buttonElevationM9171filledTonalButtonElevationR_JCAzs;
                            borderStroke4 = borderStroke2;
                            paddingValues2 = paddingValues;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i11 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z2;
                                if ((i2 & 8) == 0) {
                                    i3 &= -7169;
                                    filledTonalShape = ButtonDefaults.INSTANCE.getFilledTonalShape(composerStartRestartGroup, 6);
                                } else {
                                    filledTonalShape = shape2;
                                }
                                if ((i2 & 16) == 0) {
                                    i9 = i3 & (-57345);
                                    buttonColorsFilledTonalButtonColors = ButtonDefaults.INSTANCE.filledTonalButtonColors(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i3;
                                    buttonColorsFilledTonalButtonColors = buttonColors2;
                                }
                                if ((i2 & 32) == 0) {
                                    buttonElevationM9171filledTonalButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m9171filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 31);
                                    i3 = i9 & (-458753);
                                } else {
                                    i3 = i9;
                                }
                                if (i5 != 0) {
                                    borderStroke2 = null;
                                }
                                contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1269258330);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    z2 = z4;
                                    shape2 = filledTonalShape;
                                    buttonColors2 = buttonColorsFilledTonalButtonColors;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i10 = i3;
                                    borderStroke3 = borderStroke2;
                                    z2 = z4;
                                    shape2 = filledTonalShape;
                                    buttonColors2 = buttonColorsFilledTonalButtonColors;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1717924381, i10, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:276)");
                                    }
                                    Button(function0, modifier2, z2, shape2, buttonColors2, buttonElevationM9171filledTonalButtonElevationR_JCAzs, borderStroke3, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i10 & 2147483646, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z3 = z2;
                                    shape3 = shape2;
                                    buttonColors3 = buttonColors2;
                                    buttonElevation2 = buttonElevationM9171filledTonalButtonElevationR_JCAzs;
                                    borderStroke4 = borderStroke3;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                contentPadding = paddingValues;
                            }
                            i10 = i3;
                            borderStroke3 = borderStroke2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Button(function0, modifier2, z2, shape2, buttonColors2, buttonElevationM9171filledTonalButtonElevationR_JCAzs, borderStroke3, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i10 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z3 = z2;
                            shape3 = shape2;
                            buttonColors3 = buttonColors2;
                            buttonElevation2 = buttonElevationM9171filledTonalButtonElevationR_JCAzs;
                            borderStroke4 = borderStroke3;
                            paddingValues2 = contentPadding;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.FilledTonalButton.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ButtonColors $colors;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ ButtonElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13452(Function0<Unit> function02, Modifier modifier32, boolean z32, Shape shape32, ButtonColors buttonColors32, ButtonElevation buttonElevation22, BorderStroke borderStroke42, PaddingValues paddingValues22, MutableInteractionSource mutableInteractionSource22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i15, int i22) {
                                    super(2);
                                    function0 = function02;
                                    modifier = modifier32;
                                    z = z32;
                                    shape = shape32;
                                    buttonColors = buttonColors32;
                                    buttonElevation = buttonElevation22;
                                    borderStroke = borderStroke42;
                                    paddingValues = paddingValues22;
                                    mutableInteractionSource = mutableInteractionSource22;
                                    function3 = function32;
                                    i = i15;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    ButtonKt.FilledTonalButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i15 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 8) == 0) {
                            }
                            if ((i22 & 16) == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i7;
                mutableInteractionSource22 = mutableInteractionSource;
                if ((i22 & 512) != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i15 & 3072) == 0) {
            }
            if ((i15 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i15) == 0) {
            }
            i5 = i22 & 64;
            if (i5 != 0) {
            }
            i6 = i22 & 128;
            if (i6 != 0) {
            }
            i7 = i22 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource22 = mutableInteractionSource;
            if ((i22 & 512) != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i15 & 3072) == 0) {
        }
        if ((i15 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i15) == 0) {
        }
        i5 = i22 & 64;
        if (i5 != 0) {
        }
        i6 = i22 & 128;
        if (i6 != 0) {
        }
        i7 = i22 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource22 = mutableInteractionSource;
        if ((i22 & 512) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable ButtonColors buttonColors, @Nullable ButtonElevation buttonElevation, @Nullable BorderStroke borderStroke, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        Modifier modifier2;
        boolean z3;
        Shape outlinedShape;
        ButtonColors buttonColorsOutlinedButtonColors;
        ButtonElevation buttonElevation3;
        BorderStroke outlinedButtonBorder;
        PaddingValues contentPadding;
        MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        Shape shape3;
        ButtonElevation buttonElevation4;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues2;
        ButtonColors buttonColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694808287);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i9 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i10 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i10;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i) == 0) {
                        buttonElevation2 = buttonElevation;
                        i3 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            int i11 = composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                            i3 |= i11;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i3 |= i11;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z2;
                            shape3 = shape2;
                            buttonColors3 = buttonColors2;
                            buttonElevation4 = buttonElevation2;
                            outlinedButtonBorder = borderStroke2;
                            paddingValues2 = paddingValues;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                z3 = i4 == 0 ? true : z2;
                                if ((i2 & 8) == 0) {
                                    outlinedShape = ButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    outlinedShape = shape2;
                                }
                                if ((i2 & 16) == 0) {
                                    buttonColorsOutlinedButtonColors = ButtonDefaults.INSTANCE.outlinedButtonColors(composerStartRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    buttonColorsOutlinedButtonColors = buttonColors2;
                                }
                                buttonElevation3 = i5 == 0 ? null : buttonElevation2;
                                if ((i2 & 64) == 0) {
                                    outlinedButtonBorder = ButtonDefaults.INSTANCE.getOutlinedButtonBorder(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    outlinedButtonBorder = borderStroke2;
                                }
                                contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if (i7 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-219967464);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                contentPadding = paddingValues;
                                mutableInteractionSource2 = mutableInteractionSource;
                                z3 = z2;
                                outlinedShape = shape2;
                                buttonColorsOutlinedButtonColors = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                outlinedButtonBorder = borderStroke2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1694808287, i3, -1, "androidx.compose.material3.OutlinedButton (Button.kt:345)");
                            }
                            Button(function0, modifier2, z3, outlinedShape, buttonColorsOutlinedButtonColors, buttonElevation3, outlinedButtonBorder, contentPadding, mutableInteractionSource2, function3, composerStartRestartGroup, i3 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z3;
                            shape3 = outlinedShape;
                            buttonElevation4 = buttonElevation3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            ButtonColors buttonColors4 = buttonColorsOutlinedButtonColors;
                            paddingValues2 = contentPadding;
                            buttonColors3 = buttonColors4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.OutlinedButton.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ButtonColors $colors;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ ButtonElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13462(Function0<Unit> function02, Modifier modifier22, boolean z42, Shape shape32, ButtonColors buttonColors32, ButtonElevation buttonElevation42, BorderStroke outlinedButtonBorder2, PaddingValues paddingValues22, MutableInteractionSource mutableInteractionSource32, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i12, int i22) {
                                    super(2);
                                    function0 = function02;
                                    modifier = modifier22;
                                    z = z42;
                                    shape = shape32;
                                    buttonColors = buttonColors32;
                                    buttonElevation = buttonElevation42;
                                    borderStroke = outlinedButtonBorder2;
                                    paddingValues = paddingValues22;
                                    mutableInteractionSource = mutableInteractionSource32;
                                    function3 = function32;
                                    i = i12;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    ButtonKt.OutlinedButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 8) == 0) {
                            }
                            if ((i22 & 16) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Button(function02, modifier22, z3, outlinedShape, buttonColorsOutlinedButtonColors, buttonElevation3, outlinedButtonBorder2, contentPadding, mutableInteractionSource2, function32, composerStartRestartGroup, i3 & 2147483646, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z42 = z3;
                            shape32 = outlinedShape;
                            buttonElevation42 = buttonElevation3;
                            mutableInteractionSource32 = mutableInteractionSource2;
                            ButtonColors buttonColors42 = buttonColorsOutlinedButtonColors;
                            paddingValues22 = contentPadding;
                            buttonColors32 = buttonColors42;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i12) != 0) {
                }
                i6 = i22 & 128;
                if (i6 == 0) {
                }
                i7 = i22 & 256;
                if (i7 == 0) {
                }
                if ((i22 & 512) != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i12 & 3072) == 0) {
            }
            if ((i12 & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i12) != 0) {
            }
            i6 = i22 & 128;
            if (i6 == 0) {
            }
            i7 = i22 & 256;
            if (i7 == 0) {
            }
            if ((i22 & 512) != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i12 & 3072) == 0) {
        }
        if ((i12 & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i12) != 0) {
        }
        i6 = i22 & 128;
        if (i6 == 0) {
        }
        i7 = i22 & 256;
        if (i7 == 0) {
        }
        if ((i22 & 512) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable ButtonColors buttonColors, @Nullable ButtonElevation buttonElevation, @Nullable BorderStroke borderStroke, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        Shape shape2;
        ButtonColors buttonColors2;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        Modifier modifier2;
        boolean z2;
        Shape textShape;
        ButtonColors buttonColorsTextButtonColors;
        BorderStroke borderStroke3;
        PaddingValues paddingValues2;
        int i9;
        ButtonElevation buttonElevation3;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z3;
        ButtonColors buttonColors3;
        BorderStroke borderStroke4;
        PaddingValues paddingValues3;
        Modifier modifier3;
        Shape shape3;
        ButtonElevation buttonElevation4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2106428362);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i11 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i12 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i12;
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i) == 0) {
                        buttonElevation2 = buttonElevation;
                        i3 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            borderStroke2 = borderStroke;
                            i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i2 & 512) == 0) {
                            if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i10 == 0 ? Modifier.INSTANCE : modifier;
                                    z2 = i4 == 0 ? true : z;
                                    if ((i2 & 8) == 0) {
                                        textShape = ButtonDefaults.INSTANCE.getTextShape(composerStartRestartGroup, 6);
                                        i3 &= -7169;
                                    } else {
                                        textShape = shape2;
                                    }
                                    if ((i2 & 16) == 0) {
                                        buttonColorsTextButtonColors = ButtonDefaults.INSTANCE.textButtonColors(composerStartRestartGroup, 6);
                                        i3 &= -57345;
                                    } else {
                                        buttonColorsTextButtonColors = buttonColors2;
                                    }
                                    if (i5 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    borderStroke3 = i6 == 0 ? borderStroke2 : null;
                                    PaddingValues textButtonContentPadding = i7 == 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                                    if (i8 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(593745314);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        i9 = i3;
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                        paddingValues2 = textButtonContentPadding;
                                        buttonElevation3 = buttonElevation2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2106428362, i9, -1, "androidx.compose.material3.TextButton (Button.kt:416)");
                                        }
                                        Button(function0, modifier2, z2, textShape, buttonColorsTextButtonColors, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composerStartRestartGroup, i9 & 2147483646, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        z3 = z2;
                                        buttonColors3 = buttonColorsTextButtonColors;
                                        borderStroke4 = borderStroke3;
                                        paddingValues3 = paddingValues2;
                                        modifier3 = modifier2;
                                        shape3 = textShape;
                                        buttonElevation4 = buttonElevation3;
                                    } else {
                                        paddingValues2 = textButtonContentPadding;
                                        i9 = i3;
                                        buttonElevation3 = buttonElevation2;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    modifier2 = modifier;
                                    z2 = z;
                                    paddingValues2 = paddingValues;
                                    textShape = shape2;
                                    buttonColorsTextButtonColors = buttonColors2;
                                    buttonElevation3 = buttonElevation2;
                                    borderStroke3 = borderStroke2;
                                    i9 = i3;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Button(function0, modifier2, z2, textShape, buttonColorsTextButtonColors, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composerStartRestartGroup, i9 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z3 = z2;
                                buttonColors3 = buttonColorsTextButtonColors;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                modifier3 = modifier2;
                                shape3 = textShape;
                                buttonElevation4 = buttonElevation3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z3 = z;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation4 = buttonElevation2;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.TextButton.2
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ BorderStroke $border;
                                    public final /* synthetic */ ButtonColors $colors;
                                    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                                    public final /* synthetic */ PaddingValues $contentPadding;
                                    public final /* synthetic */ ButtonElevation $elevation;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Function0<Unit> $onClick;
                                    public final /* synthetic */ Shape $shape;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C13472(Function0<Unit> function02, Modifier modifier32, boolean z32, Shape shape32, ButtonColors buttonColors32, ButtonElevation buttonElevation42, BorderStroke borderStroke42, PaddingValues paddingValues32, MutableInteractionSource mutableInteractionSource32, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i13, int i22) {
                                        super(2);
                                        function0 = function02;
                                        modifier = modifier32;
                                        z = z32;
                                        shape = shape32;
                                        buttonColors = buttonColors32;
                                        buttonElevation = buttonElevation42;
                                        borderStroke = borderStroke42;
                                        paddingValues = paddingValues32;
                                        mutableInteractionSource = mutableInteractionSource32;
                                        function3 = function32;
                                        i = i13;
                                        i = i22;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i13) {
                                        ButtonKt.TextButton(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        if ((i3 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i13 & 1) != 0) {
                                if (i10 == 0) {
                                }
                                if (i4 == 0) {
                                }
                                if ((i22 & 8) == 0) {
                                }
                                if ((i22 & 16) == 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i22 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i22 & 256;
                    if (i8 != 0) {
                    }
                    if ((i22 & 512) == 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i22 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i22 & 128;
                if (i7 != 0) {
                }
                i8 = i22 & 256;
                if (i8 != 0) {
                }
                if ((i22 & 512) == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i13 & 3072) == 0) {
            }
            if ((i13 & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i22 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i22 & 128;
            if (i7 != 0) {
            }
            i8 = i22 & 256;
            if (i8 != 0) {
            }
            if ((i22 & 512) == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        if ((i13 & 3072) == 0) {
        }
        if ((i13 & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i22 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i22 & 128;
        if (i7 != 0) {
        }
        i8 = i22 & 256;
        if (i8 != 0) {
        }
        if ((i22 & 512) == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
