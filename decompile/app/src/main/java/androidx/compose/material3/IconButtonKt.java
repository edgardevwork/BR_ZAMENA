package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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

/* compiled from: IconButton.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001an\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001a`\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001an\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001aV\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001a\u001ad\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001c\u001al\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010 \u001az\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\"¨\u0006#"}, m7105d2 = {"FilledIconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconButton", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n1116#2,6:1002\n1116#2,6:1048\n1116#2,6:1094\n1116#2,6:1100\n1116#2,6:1106\n1116#2,6:1112\n1116#2,6:1118\n1116#2,6:1124\n75#3:1008\n75#3:1054\n69#4,5:1009\n74#4:1042\n78#4:1047\n69#4,5:1055\n74#4:1088\n78#4:1093\n78#5,11:1014\n91#5:1046\n78#5,11:1060\n91#5:1092\n456#6,8:1025\n464#6,3:1039\n467#6,3:1043\n456#6,8:1071\n464#6,3:1085\n467#6,3:1089\n3737#7,6:1033\n3737#7,6:1079\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n*L\n80#1:1002,6\n142#1:1048,6\n206#1:1094,6\n266#1:1100,6\n324#1:1106,6\n388#1:1112,6\n453#1:1118,6\n515#1:1124,6\n97#1:1008\n160#1:1054\n84#1:1009,5\n84#1:1042\n84#1:1047\n146#1:1055,5\n146#1:1088\n146#1:1093\n84#1:1014,11\n84#1:1046\n146#1:1060,11\n146#1:1092\n84#1:1025,8\n84#1:1039,3\n84#1:1043,3\n146#1:1071,8\n146#1:1085,3\n146#1:1089,3\n84#1:1033,6\n146#1:1079,6\n*E\n"})
/* loaded from: classes4.dex */
public final class IconButtonKt {

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledIconButton$4 */
    /* loaded from: classes.dex */
    public static final class C14614 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ IconButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14614(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            iconButtonColors = iconButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.FilledIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$4 */
    /* loaded from: classes.dex */
    public static final class C14644 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ IconToggleButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14644(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            z = z;
            function1 = function1;
            modifier = modifier;
            z = z2;
            shape = shape;
            iconToggleButtonColors = iconToggleButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.FilledIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$4 */
    /* loaded from: classes.dex */
    public static final class C14674 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ IconButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14674(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            iconButtonColors = iconButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.FilledTonalIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$4 */
    /* loaded from: classes.dex */
    public static final class C14704 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ IconToggleButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14704(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            z = z;
            function1 = function1;
            modifier = modifier;
            z = z2;
            shape = shape;
            iconToggleButtonColors = iconToggleButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.FilledTonalIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$IconButton$3 */
    /* loaded from: classes.dex */
    public static final class C14713 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ IconButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14713(Function0<Unit> function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            iconButtonColors = iconButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$IconToggleButton$3 */
    /* loaded from: classes.dex */
    public static final class C14723 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ IconToggleButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14723(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            z = z;
            function1 = function1;
            modifier = modifier;
            z = z2;
            iconToggleButtonColors = iconToggleButtonColors;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.IconToggleButton(z, function1, modifier, z, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconButton$4 */
    /* loaded from: classes.dex */
    public static final class C14754 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ IconButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14754(Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z;
            shape = shape;
            iconButtonColors = iconButtonColors;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.OutlinedIconButton(function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$4 */
    /* loaded from: classes.dex */
    public static final class C14784 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ IconToggleButtonColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14784(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            z = z;
            function1 = function1;
            modifier = modifier;
            z = z2;
            shape = shape;
            iconToggleButtonColors = iconToggleButtonColors;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IconButtonKt.OutlinedIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable IconButtonColors iconButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z3;
        IconButtonColors iconButtonColors3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        IconButtonColors iconButtonColors4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1142896114);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
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
                        iconButtonColors2 = iconButtonColors;
                        int i8 = composerStartRestartGroup.changed(iconButtonColors2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i3 |= i8;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(composerStartRestartGroup, 6);
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(793644531);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                modifier3 = modifier2;
                                z3 = z2;
                                iconButtonColors3 = iconButtonColors2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1142896114, i6, -1, "androidx.compose.material3.IconButton (IconButton.kt:81)");
                            }
                            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                            IconButtonTokens iconButtonTokens = IconButtonTokens.INSTANCE;
                            int i9 = i6;
                            IconButtonColors iconButtonColors5 = iconButtonColors3;
                            Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8172size3ABfNKs(modifierMinimumInteractiveComponentSize, iconButtonTokens.m10491getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(iconButtonTokens.getStateLayerShape(), composerStartRestartGroup, 6)), iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(iconButtonTokens.m10491getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z3, null, Role.m12986boximpl(Role.INSTANCE.m12993getButtono7Vup1c()), function0, 8, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(iconButtonColors5.m9481contentColorvNxB06k$material3_release(z3))), function2, composerStartRestartGroup, ProvidedValue.$stable | ((i9 >> 12) & 112));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            iconButtonColors4 = iconButtonColors5;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        modifier3 = modifier2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                        IconButtonTokens iconButtonTokens2 = IconButtonTokens.INSTANCE;
                        int i92 = i6;
                        IconButtonColors iconButtonColors52 = iconButtonColors3;
                        Modifier modifierM7803clickableO2vRcR0$default2 = ClickableKt.m7803clickableO2vRcR0$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8172size3ABfNKs(modifierMinimumInteractiveComponentSize2, iconButtonTokens2.m10491getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(iconButtonTokens2.getStateLayerShape(), composerStartRestartGroup, 6)), iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(iconButtonTokens2.m10491getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z3, null, Role.m12986boximpl(Role.INSTANCE.m12993getButtono7Vup1c()), function0, 8, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(iconButtonColors52.m9481contentColorvNxB06k$material3_release(z3))), function2, composerStartRestartGroup, ProvidedValue.$stable | ((i92 >> 12) & 112));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier3;
                            iconButtonColors4 = iconButtonColors52;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        iconButtonColors4 = iconButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.IconButton.3
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ IconButtonColors $colors;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function0<Unit> $onClick;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C14713(Function0<Unit> function02, Modifier modifier22, boolean z42, IconButtonColors iconButtonColors42, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function22, int i10, int i22) {
                                super(2);
                                function0 = function02;
                                modifier = modifier22;
                                z = z42;
                                iconButtonColors = iconButtonColors42;
                                mutableInteractionSource = mutableInteractionSource42;
                                function2 = function22;
                                i = i10;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i10) {
                                IconButtonKt.IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= CpioConstants.C_ISBLK;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i22 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i22 & 8) != 0) {
                        }
                        if (i5 == 0) {
                            z3 = z2;
                            iconButtonColors3 = iconButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i6 = i3;
                            modifier3 = modifier22;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierMinimumInteractiveComponentSize22 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                        IconButtonTokens iconButtonTokens22 = IconButtonTokens.INSTANCE;
                        int i922 = i6;
                        IconButtonColors iconButtonColors522 = iconButtonColors3;
                        Modifier modifierM7803clickableO2vRcR0$default22 = ClickableKt.m7803clickableO2vRcR0$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8172size3ABfNKs(modifierMinimumInteractiveComponentSize22, iconButtonTokens22.m10491getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(iconButtonTokens22.getStateLayerShape(), composerStartRestartGroup, 6)), iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(iconButtonTokens22.m10491getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z3, null, Role.m12986boximpl(Role.INSTANCE.m12993getButtono7Vup1c()), function02, 8, null);
                        Alignment center22 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default22);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting()) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i10 & 3072) == 0) {
            }
            i5 = i22 & 16;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i22 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i10 & 3072) == 0) {
        }
        i5 = i22 & 16;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i22 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(boolean z, @NotNull Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable IconToggleButtonColors iconToggleButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColorsM9492iconToggleButtonColors5tl4gsc;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        IconToggleButtonColors iconToggleButtonColors3;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors4;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(692561811);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        int i7 = composerStartRestartGroup.changed(iconToggleButtonColors2) ? 16384 : 8192;
                        i3 |= i7;
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i3 |= i7;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z5 = z3;
                    iconToggleButtonColors4 = iconToggleButtonColors2;
                    composer2 = composerStartRestartGroup;
                    mutableInteractionSource4 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        z4 = i4 == 0 ? true : z3;
                        if ((i2 & 16) == 0) {
                            iconToggleButtonColorsM9492iconToggleButtonColors5tl4gsc = IconButtonDefaults.INSTANCE.m9492iconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i3 &= -57345;
                        } else {
                            iconToggleButtonColorsM9492iconToggleButtonColors5tl4gsc = iconToggleButtonColors2;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(155032829);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier5;
                            iconToggleButtonColors3 = iconToggleButtonColorsM9492iconToggleButtonColors5tl4gsc;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier3 = modifier5;
                            iconToggleButtonColors3 = iconToggleButtonColorsM9492iconToggleButtonColors5tl4gsc;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(692561811, i3, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:143)");
                    }
                    Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    IconButtonTokens iconButtonTokens = IconButtonTokens.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m8172size3ABfNKs(modifierMinimumInteractiveComponentSize, iconButtonTokens.m10491getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(iconButtonTokens.getStateLayerShape(), composerStartRestartGroup, 6));
                    int i8 = ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 6) & 896);
                    int i9 = i3;
                    IconToggleButtonColors iconToggleButtonColors5 = iconToggleButtonColors3;
                    boolean z6 = z4;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM8367toggleableO2vRcR0 = ToggleableKt.m8367toggleableO2vRcR0(BackgroundKt.m7771backgroundbw27NRU$default(modifierClip, iconToggleButtonColors3.containerColor$material3_release(z4, z, composerStartRestartGroup, i8).getValue().m11350unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(iconButtonTokens.m10491getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z4, Role.m12986boximpl(Role.INSTANCE.m12994getCheckboxo7Vup1c()), function1);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8367toggleableO2vRcR0);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor);
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(iconToggleButtonColors5.contentColor$material3_release(z6, z, composer2, i8).getValue().m11350unboximpl())), function2, composer2, ProvidedValue.$stable | ((i9 >> 15) & 112));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z6;
                    iconToggleButtonColors4 = iconToggleButtonColors5;
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.IconToggleButton.3
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ boolean $checked;
                        public final /* synthetic */ IconToggleButtonColors $colors;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14723(boolean z7, Function1<? super Boolean, Unit> function12, Modifier modifier42, boolean z52, IconToggleButtonColors iconToggleButtonColors42, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function22, int i10, int i22) {
                            super(2);
                            z = z7;
                            function1 = function12;
                            modifier = modifier42;
                            z = z52;
                            iconToggleButtonColors = iconToggleButtonColors42;
                            mutableInteractionSource = mutableInteractionSource42;
                            function2 = function22;
                            i = i10;
                            i = i22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i10) {
                            IconButtonKt.IconToggleButton(z, function1, modifier, z, iconToggleButtonColors, mutableInteractionSource, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z3 = z2;
            if ((i10 & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            if ((i22 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i22 & 16) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    IconButtonTokens iconButtonTokens2 = IconButtonTokens.INSTANCE;
                    Modifier modifierClip2 = ClipKt.clip(SizeKt.m8172size3ABfNKs(modifierMinimumInteractiveComponentSize2, iconButtonTokens2.m10491getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(iconButtonTokens2.getStateLayerShape(), composerStartRestartGroup, 6));
                    int i82 = ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 6) & 896);
                    int i92 = i3;
                    IconToggleButtonColors iconToggleButtonColors52 = iconToggleButtonColors3;
                    boolean z62 = z4;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM8367toggleableO2vRcR02 = ToggleableKt.m8367toggleableO2vRcR0(BackgroundKt.m7771backgroundbw27NRU$default(modifierClip2, iconToggleButtonColors3.containerColor$material3_release(z4, z7, composerStartRestartGroup, i82).getValue().m11350unboximpl(), null, 2, null), z7, mutableInteractionSource3, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(iconButtonTokens2.m10491getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z4, Role.m12986boximpl(Role.INSTANCE.m12994getCheckboxo7Vup1c()), function12);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8367toggleableO2vRcR02);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(iconToggleButtonColors52.contentColor$material3_release(z62, z7, composer2, i82).getValue().m11350unboximpl())), function22, composer2, ProvidedValue.$stable | ((i92 >> 15) & 112));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z52 = z62;
                        iconToggleButtonColors42 = iconToggleButtonColors52;
                        modifier42 = modifier3;
                        mutableInteractionSource42 = mutableInteractionSource3;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i22 & 8;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((i10 & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        if ((i22 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable IconButtonColors iconButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z3;
        Shape filledShape;
        IconButtonColors iconButtonColorsM9487filledIconButtonColorsro_MJ88;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        IconButtonColors iconButtonColors3;
        IconButtonColors iconButtonColors4;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1594730011);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i8 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        int i9 = composerStartRestartGroup.changed(iconButtonColors2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i3 |= i9;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                    filledShape = shape2;
                    iconButtonColors4 = iconButtonColors2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? true : z2;
                        if ((i2 & 8) == 0) {
                            filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            filledShape = shape2;
                        }
                        if ((i2 & 16) == 0) {
                            iconButtonColorsM9487filledIconButtonColorsro_MJ88 = IconButtonDefaults.INSTANCE.m9487filledIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                            i3 &= -57345;
                        } else {
                            iconButtonColorsM9487filledIconButtonColorsro_MJ88 = iconButtonColors2;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(825486780);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        IconButtonColors iconButtonColors5 = iconButtonColorsM9487filledIconButtonColorsro_MJ88;
                        i6 = i3;
                        iconButtonColors3 = iconButtonColors5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        z3 = z2;
                        filledShape = shape2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        iconButtonColors3 = iconButtonColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1594730011, i6, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:207)");
                    }
                    SurfaceKt.m9879Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier3, false, C14592.INSTANCE, 1, null), z3, filledShape, iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), iconButtonColors3.m9481contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14603(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:216)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m10455getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z5 = z3;
                    iconButtonColors4 = iconButtonColors3;
                    z4 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconButton.4
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ IconButtonColors $colors;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function0<Unit> $onClick;
                        public final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14614(Function0<Unit> function02, Modifier modifier32, boolean z42, Shape filledShape2, IconButtonColors iconButtonColors42, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function22, int i10, int i22) {
                            super(2);
                            function0 = function02;
                            modifier = modifier32;
                            z = z42;
                            shape = filledShape2;
                            iconButtonColors = iconButtonColors42;
                            mutableInteractionSource = mutableInteractionSource32;
                            function2 = function22;
                            i = i10;
                            i = i22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i10) {
                            IconButtonKt.FilledIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            if ((i22 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i22 & 8) == 0) {
                    }
                    if ((i22 & 16) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    IconButtonColors iconButtonColors52 = iconButtonColorsM9487filledIconButtonColorsro_MJ88;
                    i6 = i3;
                    iconButtonColors3 = iconButtonColors52;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SurfaceKt.m9879Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(modifier32, false, C14592.INSTANCE, 1, null), z3, filledShape2, iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), iconButtonColors3.m9481contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource32, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14603(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:216)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m10455getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    boolean z52 = z3;
                    iconButtonColors42 = iconButtonColors3;
                    z42 = z52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i22 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        if ((i22 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledIconButton$2 */
    /* loaded from: classes.dex */
    public static final class C14592 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C14592 INSTANCE = ;

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

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledIconButton$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n69#2,5:1002\n74#2:1035\n78#2:1040\n78#3,11:1007\n91#3:1039\n456#4,8:1018\n464#4,3:1032\n467#4,3:1036\n3737#5,6:1026\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledIconButton$3\n*L\n217#1:1002,5\n217#1:1035\n217#1:1040\n217#1:1007,11\n217#1:1039\n217#1:1018,8\n217#1:1032,3\n217#1:1036,3\n217#1:1026,6\n*E\n"})
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledIconButton$3 */
    /* loaded from: classes.dex */
    public static final class C14603 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14603(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i10) {
            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:216)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m10455getContainerSizeD9Ej5fM());
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable IconButtonColors iconButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z3;
        Shape filledShape;
        IconButtonColors iconButtonColorsM9489filledTonalIconButtonColorsro_MJ88;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        IconButtonColors iconButtonColors3;
        IconButtonColors iconButtonColors4;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-783937767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i8 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        int i9 = composerStartRestartGroup.changed(iconButtonColors2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i3 |= i9;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                    filledShape = shape2;
                    iconButtonColors4 = iconButtonColors2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? true : z2;
                        if ((i2 & 8) == 0) {
                            filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            filledShape = shape2;
                        }
                        if ((i2 & 16) == 0) {
                            iconButtonColorsM9489filledTonalIconButtonColorsro_MJ88 = IconButtonDefaults.INSTANCE.m9489filledTonalIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                            i3 &= -57345;
                        } else {
                            iconButtonColorsM9489filledTonalIconButtonColorsro_MJ88 = iconButtonColors2;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(1459260166);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        IconButtonColors iconButtonColors5 = iconButtonColorsM9489filledTonalIconButtonColorsro_MJ88;
                        i6 = i3;
                        iconButtonColors3 = iconButtonColors5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        z3 = z2;
                        filledShape = shape2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        iconButtonColors3 = iconButtonColors2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-783937767, i6, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:267)");
                    }
                    SurfaceKt.m9879Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier3, false, C14652.INSTANCE, 1, null), z3, filledShape, iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), iconButtonColors3.m9481contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14663(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1772884636, i10, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:276)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m10471getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z5 = z3;
                    iconButtonColors4 = iconButtonColors3;
                    z4 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconButton.4
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ IconButtonColors $colors;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function0<Unit> $onClick;
                        public final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14674(Function0<Unit> function02, Modifier modifier32, boolean z42, Shape filledShape2, IconButtonColors iconButtonColors42, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function22, int i10, int i22) {
                            super(2);
                            function0 = function02;
                            modifier = modifier32;
                            z = z42;
                            shape = filledShape2;
                            iconButtonColors = iconButtonColors42;
                            mutableInteractionSource = mutableInteractionSource32;
                            function2 = function22;
                            i = i10;
                            i = i22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i10) {
                            IconButtonKt.FilledTonalIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            if ((i22 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i22 & 8) == 0) {
                    }
                    if ((i22 & 16) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    IconButtonColors iconButtonColors52 = iconButtonColorsM9489filledTonalIconButtonColorsro_MJ88;
                    i6 = i3;
                    iconButtonColors3 = iconButtonColors52;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SurfaceKt.m9879Surfaceo_FOJdg(function02, SemanticsModifierKt.semantics$default(modifier32, false, C14652.INSTANCE, 1, null), z3, filledShape2, iconButtonColors3.m9480containerColorvNxB06k$material3_release(z3), iconButtonColors3.m9481contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource32, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14663(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1772884636, i10, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:276)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m10471getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    boolean z52 = z3;
                    iconButtonColors42 = iconButtonColors3;
                    z42 = z52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i22 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        if ((i22 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2 */
    /* loaded from: classes.dex */
    public static final class C14652 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C14652 INSTANCE = ;

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

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledTonalIconButton$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n69#2,5:1002\n74#2:1035\n78#2:1040\n78#3,11:1007\n91#3:1039\n456#4,8:1018\n464#4,3:1032\n467#4,3:1036\n3737#5,6:1026\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledTonalIconButton$3\n*L\n277#1:1002,5\n277#1:1035\n277#1:1040\n277#1:1007,11\n277#1:1039\n277#1:1018,8\n277#1:1032,3\n277#1:1036,3\n277#1:1026,6\n*E\n"})
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3 */
    /* loaded from: classes.dex */
    public static final class C14663 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14663(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i10) {
            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1772884636, i10, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:276)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m10471getContainerSizeD9Ej5fM());
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(boolean z, @NotNull Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable Shape shape, @Nullable IconToggleButtonColors iconToggleButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape filledShape;
        IconToggleButtonColors iconToggleButtonColorsM9488filledIconToggleButtonColors5tl4gsc;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        boolean z4;
        Composer composer2;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        IconToggleButtonColors iconToggleButtonColors4;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1708189280);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i8 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        int i9 = composerStartRestartGroup.changed(iconToggleButtonColors2) ? 131072 : 65536;
                        i3 |= i9;
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i3 |= i9;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) == 0) {
                                filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                filledShape = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                iconToggleButtonColorsM9488filledIconToggleButtonColors5tl4gsc = IconButtonDefaults.INSTANCE.m9488filledIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i3 &= -458753;
                            } else {
                                iconToggleButtonColorsM9488filledIconToggleButtonColors5tl4gsc = iconToggleButtonColors2;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(1287876812);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                shape3 = filledShape;
                                z4 = z3;
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                iconToggleButtonColors3 = iconToggleButtonColorsM9488filledIconToggleButtonColors5tl4gsc;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1708189280, i6, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:325)");
                                }
                                int i10 = i6 >> 9;
                                int i11 = (i10 & 14) | ((i6 << 3) & 112) | (i10 & 896);
                                Modifier modifier4 = modifier2;
                                IconToggleButtonColors iconToggleButtonColors5 = iconToggleButtonColors3;
                                boolean z6 = z4;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m9878Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, C14622.INSTANCE, 1, null), z6, shape3, iconToggleButtonColors3.containerColor$material3_release(z4, z, composerStartRestartGroup, i11).getValue().m11350unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, composerStartRestartGroup, i11).getValue().m11350unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconToggleButton.3
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C14633(Function2<? super Composer, ? super Integer, Unit> function22) {
                                        super(2);
                                        function2 = function22;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i12) {
                                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1235871670, i12, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:335)");
                                            }
                                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m10455getContainerSizeD9Ej5fM());
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer3, 0);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape4 = shape3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = modifier4;
                                iconToggleButtonColors4 = iconToggleButtonColors5;
                                z5 = z6;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i6 = i3;
                                shape3 = filledShape;
                                iconToggleButtonColors3 = iconToggleButtonColorsM9488filledIconToggleButtonColors5tl4gsc;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            shape3 = shape2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i6 = i3;
                        }
                        z4 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i6 >> 9;
                        int i112 = (i102 & 14) | ((i6 << 3) & 112) | (i102 & 896);
                        Modifier modifier42 = modifier2;
                        IconToggleButtonColors iconToggleButtonColors52 = iconToggleButtonColors3;
                        boolean z62 = z4;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m9878Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, C14622.INSTANCE, 1, null), z62, shape3, iconToggleButtonColors3.containerColor$material3_release(z4, z, composerStartRestartGroup, i112).getValue().m11350unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, composerStartRestartGroup, i112).getValue().m11350unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconToggleButton.3
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C14633(Function2<? super Composer, ? super Integer, Unit> function22) {
                                super(2);
                                function2 = function22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1235871670, i12, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:335)");
                                    }
                                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m10455getContainerSizeD9Ej5fM());
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer3, 0);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape4 = shape3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier3 = modifier42;
                        iconToggleButtonColors4 = iconToggleButtonColors52;
                        z5 = z62;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        composer2 = composerStartRestartGroup;
                        z5 = z3;
                        shape4 = shape2;
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledIconToggleButton.4
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ boolean $checked;
                            public final /* synthetic */ IconToggleButtonColors $colors;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                            public final /* synthetic */ Shape $shape;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C14644(boolean z7, Function1<? super Boolean, Unit> function12, Modifier modifier32, boolean z52, Shape shape42, IconToggleButtonColors iconToggleButtonColors42, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function22, int i12, int i22) {
                                super(2);
                                z = z7;
                                function1 = function12;
                                modifier = modifier32;
                                z = z52;
                                shape = shape42;
                                iconToggleButtonColors = iconToggleButtonColors42;
                                mutableInteractionSource = mutableInteractionSource42;
                                function2 = function22;
                                i = i12;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                IconButtonKt.FilledIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i22 & 128) == 0) {
                }
                if ((4793491 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i22 & 16) == 0) {
                        }
                        if ((i22 & 32) == 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i12 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i12) == 0) {
            }
            i5 = i22 & 64;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i22 & 128) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i12 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i12) == 0) {
        }
        i5 = i22 & 64;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i22 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2 */
    /* loaded from: classes.dex */
    public static final class C14622 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C14622 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12994getCheckboxo7Vup1c());
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledIconToggleButton$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n69#2,5:1002\n74#2:1035\n78#2:1040\n78#3,11:1007\n91#3:1039\n456#4,8:1018\n464#4,3:1032\n467#4,3:1036\n3737#5,6:1026\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledIconToggleButton$3\n*L\n336#1:1002,5\n336#1:1035\n336#1:1040\n336#1:1007,11\n336#1:1039\n336#1:1018,8\n336#1:1032,3\n336#1:1036,3\n336#1:1026,6\n*E\n"})
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3 */
    /* loaded from: classes.dex */
    public static final class C14633 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14633(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
            invoke(composer3, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer3, int i12) {
            if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1235871670, i12, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:335)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m10455getContainerSizeD9Ej5fM());
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                composer3.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                composer3.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer3, 0);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer3.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(boolean z, @NotNull Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable Shape shape, @Nullable IconToggleButtonColors iconToggleButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape filledShape;
        IconToggleButtonColors iconToggleButtonColorsM9490filledTonalIconToggleButtonColors5tl4gsc;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        boolean z4;
        Composer composer2;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        IconToggleButtonColors iconToggleButtonColors4;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1676089246);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i8 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        int i9 = composerStartRestartGroup.changed(iconToggleButtonColors2) ? 131072 : 65536;
                        i3 |= i9;
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i3 |= i9;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) == 0) {
                                filledShape = IconButtonDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                filledShape = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                iconToggleButtonColorsM9490filledTonalIconToggleButtonColors5tl4gsc = IconButtonDefaults.INSTANCE.m9490filledTonalIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i3 &= -458753;
                            } else {
                                iconToggleButtonColorsM9490filledTonalIconToggleButtonColors5tl4gsc = iconToggleButtonColors2;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(353404489);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                shape3 = filledShape;
                                z4 = z3;
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                iconToggleButtonColors3 = iconToggleButtonColorsM9490filledTonalIconToggleButtonColors5tl4gsc;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1676089246, i6, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:389)");
                                }
                                int i10 = i6 >> 9;
                                int i11 = (i10 & 14) | ((i6 << 3) & 112) | (i10 & 896);
                                Modifier modifier4 = modifier2;
                                IconToggleButtonColors iconToggleButtonColors5 = iconToggleButtonColors3;
                                boolean z6 = z4;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m9878Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, C14682.INSTANCE, 1, null), z6, shape3, iconToggleButtonColors3.containerColor$material3_release(z4, z, composerStartRestartGroup, i11).getValue().m11350unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, composerStartRestartGroup, i11).getValue().m11350unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton.3
                                    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C14693(Function2<? super Composer, ? super Integer, Unit> function22) {
                                        super(2);
                                        function2 = function22;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i12) {
                                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-58218680, i12, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:399)");
                                            }
                                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m10471getContainerSizeD9Ej5fM());
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer3, 0);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape4 = shape3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = modifier4;
                                iconToggleButtonColors4 = iconToggleButtonColors5;
                                z5 = z6;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i6 = i3;
                                shape3 = filledShape;
                                iconToggleButtonColors3 = iconToggleButtonColorsM9490filledTonalIconToggleButtonColors5tl4gsc;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            shape3 = shape2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i6 = i3;
                        }
                        z4 = z3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i6 >> 9;
                        int i112 = (i102 & 14) | ((i6 << 3) & 112) | (i102 & 896);
                        Modifier modifier42 = modifier2;
                        IconToggleButtonColors iconToggleButtonColors52 = iconToggleButtonColors3;
                        boolean z62 = z4;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m9878Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, C14682.INSTANCE, 1, null), z62, shape3, iconToggleButtonColors3.containerColor$material3_release(z4, z, composerStartRestartGroup, i112).getValue().m11350unboximpl(), iconToggleButtonColors3.contentColor$material3_release(z4, z, composerStartRestartGroup, i112).getValue().m11350unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton.3
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C14693(Function2<? super Composer, ? super Integer, Unit> function22) {
                                super(2);
                                function2 = function22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-58218680, i12, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:399)");
                                    }
                                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m10471getContainerSizeD9Ej5fM());
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer3, 0);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape4 = shape3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier3 = modifier42;
                        iconToggleButtonColors4 = iconToggleButtonColors52;
                        z5 = z62;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        composer2 = composerStartRestartGroup;
                        z5 = z3;
                        shape4 = shape2;
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton.4
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ boolean $checked;
                            public final /* synthetic */ IconToggleButtonColors $colors;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                            public final /* synthetic */ Shape $shape;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C14704(boolean z7, Function1<? super Boolean, Unit> function12, Modifier modifier32, boolean z52, Shape shape42, IconToggleButtonColors iconToggleButtonColors42, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function22, int i12, int i22) {
                                super(2);
                                z = z7;
                                function1 = function12;
                                modifier = modifier32;
                                z = z52;
                                shape = shape42;
                                iconToggleButtonColors = iconToggleButtonColors42;
                                mutableInteractionSource = mutableInteractionSource42;
                                function2 = function22;
                                i = i12;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                IconButtonKt.FilledTonalIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i22 & 128) == 0) {
                }
                if ((4793491 & i3) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i22 & 16) == 0) {
                        }
                        if ((i22 & 32) == 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i12 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i12) == 0) {
            }
            i5 = i22 & 64;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i22 & 128) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i12 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i12) == 0) {
        }
        i5 = i22 & 64;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i22 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2 */
    /* loaded from: classes.dex */
    public static final class C14682 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C14682 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12994getCheckboxo7Vup1c());
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledTonalIconToggleButton$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n69#2,5:1002\n74#2:1035\n78#2:1040\n78#3,11:1007\n91#3:1039\n456#4,8:1018\n464#4,3:1032\n467#4,3:1036\n3737#5,6:1026\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$FilledTonalIconToggleButton$3\n*L\n400#1:1002,5\n400#1:1035\n400#1:1040\n400#1:1007,11\n400#1:1039\n400#1:1018,8\n400#1:1032,3\n400#1:1036,3\n400#1:1026,6\n*E\n"})
    /* renamed from: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3 */
    /* loaded from: classes.dex */
    public static final class C14693 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14693(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
            invoke(composer3, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer3, int i12) {
            if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-58218680, i12, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:399)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m10471getContainerSizeD9Ej5fM());
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                composer3.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                composer3.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer3, 0);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer3.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(@NotNull Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, @Nullable IconButtonColors iconButtonColors, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape outlinedShape;
        boolean z3;
        IconButtonColors iconButtonColorsM9493outlinedIconButtonColorsro_MJ88;
        BorderStroke borderStrokeOutlinedIconButtonBorder;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        BorderStroke borderStroke3;
        ?? r4;
        Shape shape3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1746603025);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i8 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        int i9 = composerStartRestartGroup.changed(iconButtonColors2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i3 |= i9;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                if ((196608 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(borderStroke2)) ? 131072 : 65536;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((1572864 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    shape3 = shape2;
                    iconButtonColorsM9493outlinedIconButtonColorsro_MJ88 = iconButtonColors2;
                    mutableInteractionSource4 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) == 0) {
                            outlinedShape = IconButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            outlinedShape = shape2;
                        }
                        if ((i2 & 16) == 0) {
                            z3 = true;
                            iconButtonColorsM9493outlinedIconButtonColorsro_MJ88 = IconButtonDefaults.INSTANCE.m9493outlinedIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                            i3 &= -57345;
                        } else {
                            z3 = true;
                            iconButtonColorsM9493outlinedIconButtonColorsro_MJ88 = iconButtonColors2;
                        }
                        if ((i2 & 32) == 0) {
                            borderStrokeOutlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                        } else {
                            borderStrokeOutlinedIconButtonBorder = borderStroke;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(1332264784);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        BorderStroke borderStroke4 = borderStrokeOutlinedIconButtonBorder;
                        i6 = i3;
                        borderStroke3 = borderStroke4;
                        r4 = z3;
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
                        outlinedShape = shape2;
                        iconButtonColorsM9493outlinedIconButtonColorsro_MJ88 = iconButtonColors2;
                        r4 = 1;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        borderStroke3 = borderStroke2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1746603025, i6, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:454)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier2, false, C14732.INSTANCE, r4, null);
                    long jM9480containerColorvNxB06k$material3_release = iconButtonColorsM9493outlinedIconButtonColorsro_MJ88.m9480containerColorvNxB06k$material3_release(z2);
                    long jM9481contentColorvNxB06k$material3_release = iconButtonColorsM9493outlinedIconButtonColorsro_MJ88.m9481contentColorvNxB06k$material3_release(z2);
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 582332538, r4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14743(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i10) {
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(582332538, i10, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:464)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m10558getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                    int i10 = i6 & 8078;
                    int i11 = i6 << 9;
                    SurfaceKt.m9879Surfaceo_FOJdg(function0, modifierSemantics$default, z2, outlinedShape, jM9480containerColorvNxB06k$material3_release, jM9481contentColorvNxB06k$material3_release, 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, composableLambda, composerStartRestartGroup, i10 | (234881024 & i11) | (i11 & 1879048192), 6, 192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = outlinedShape;
                    borderStroke2 = borderStroke3;
                    z4 = z2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconButton.4
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ BorderStroke $border;
                        public final /* synthetic */ IconButtonColors $colors;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function0<Unit> $onClick;
                        public final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14754(Function0<Unit> function02, Modifier modifier22, boolean z42, Shape shape32, IconButtonColors iconButtonColorsM9493outlinedIconButtonColorsro_MJ882, BorderStroke borderStroke22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function22, int i12, int i22) {
                            super(2);
                            function0 = function02;
                            modifier = modifier22;
                            z = z42;
                            shape = shape32;
                            iconButtonColors = iconButtonColorsM9493outlinedIconButtonColorsro_MJ882;
                            borderStroke = borderStroke22;
                            mutableInteractionSource = mutableInteractionSource42;
                            function2 = function22;
                            i = i12;
                            i = i22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            IconButtonKt.OutlinedIconButton(function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i12 & 3072) == 0) {
            }
            if ((i12 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i12) == 0) {
            }
            i5 = i22 & 64;
            if (i5 != 0) {
            }
            if ((i22 & 128) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i22 & 8) == 0) {
                    }
                    if ((i22 & 16) == 0) {
                    }
                    if ((i22 & 32) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    BorderStroke borderStroke42 = borderStrokeOutlinedIconButtonBorder;
                    i6 = i3;
                    borderStroke3 = borderStroke42;
                    r4 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifier22, false, C14732.INSTANCE, r4, null);
                    long jM9480containerColorvNxB06k$material3_release2 = iconButtonColorsM9493outlinedIconButtonColorsro_MJ882.m9480containerColorvNxB06k$material3_release(z2);
                    long jM9481contentColorvNxB06k$material3_release2 = iconButtonColorsM9493outlinedIconButtonColorsro_MJ882.m9481contentColorvNxB06k$material3_release(z2);
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 582332538, r4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14743(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i102) {
                            if ((i102 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(582332538, i102, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:464)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m10558getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                    int i102 = i6 & 8078;
                    int i112 = i6 << 9;
                    SurfaceKt.m9879Surfaceo_FOJdg(function02, modifierSemantics$default2, z2, outlinedShape, jM9480containerColorvNxB06k$material3_release2, jM9481contentColorvNxB06k$material3_release2, 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, composableLambda2, composerStartRestartGroup, i102 | (234881024 & i112) | (i112 & 1879048192), 6, 192);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape32 = outlinedShape;
                    borderStroke22 = borderStroke3;
                    z42 = z2;
                    mutableInteractionSource42 = mutableInteractionSource3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i12 & 3072) == 0) {
        }
        if ((i12 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i12) == 0) {
        }
        i5 = i22 & 64;
        if (i5 != 0) {
        }
        if ((i22 & 128) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2 */
    /* loaded from: classes.dex */
    public static final class C14732 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C14732 INSTANCE = ;

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

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$OutlinedIconButton$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n69#2,5:1002\n74#2:1035\n78#2:1040\n78#3,11:1007\n91#3:1039\n456#4,8:1018\n464#4,3:1032\n467#4,3:1036\n3737#5,6:1026\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$OutlinedIconButton$3\n*L\n465#1:1002,5\n465#1:1035\n465#1:1040\n465#1:1007,11\n465#1:1039\n465#1:1018,8\n465#1:1032,3\n465#1:1036,3\n465#1:1026,6\n*E\n"})
    /* renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconButton$3 */
    /* loaded from: classes.dex */
    public static final class C14743 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14743(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i102) {
            if ((i102 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(582332538, i102, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:464)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m10558getContainerSizeD9Ej5fM());
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(boolean z, @NotNull Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable Shape shape, @Nullable IconToggleButtonColors iconToggleButtonColors, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape outlinedShape;
        IconToggleButtonColors iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc;
        BorderStroke borderStroke2;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        Shape shape2;
        BorderStroke borderStroke3;
        Modifier modifier2;
        boolean z4;
        Composer composer2;
        Shape shape3;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource3;
        boolean z5;
        Modifier modifier3;
        IconToggleButtonColors iconToggleButtonColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1470292106);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        outlinedShape = shape;
                        int i9 = composerStartRestartGroup.changed(outlinedShape) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        outlinedShape = shape;
                    }
                    i3 |= i9;
                } else {
                    outlinedShape = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc = iconToggleButtonColors;
                        int i10 = composerStartRestartGroup.changed(iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc = iconToggleButtonColors;
                    }
                    i3 |= i10;
                } else {
                    iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc = iconToggleButtonColors;
                }
                if ((1572864 & i) == 0) {
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
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    z5 = z3;
                    shape3 = outlinedShape;
                    iconToggleButtonColors2 = iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc;
                    borderStroke4 = borderStroke2;
                    modifier3 = modifier;
                    mutableInteractionSource3 = mutableInteractionSource;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            outlinedShape = IconButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                        }
                        if ((i2 & 32) == 0) {
                            i6 = i5;
                            i3 &= -458753;
                            iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc = IconButtonDefaults.INSTANCE.m9494outlinedIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        } else {
                            i6 = i5;
                        }
                        if ((i2 & 64) != 0) {
                            BorderStroke borderStrokeOutlinedIconToggleButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z3, z, composerStartRestartGroup, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            borderStroke2 = borderStrokeOutlinedIconToggleButtonBorder;
                        }
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(1810360331);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            i7 = i3;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i7 = i3;
                        }
                        shape2 = outlinedShape;
                        borderStroke3 = borderStroke2;
                        modifier2 = modifier4;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        i7 = i3;
                        z4 = z3;
                        shape2 = outlinedShape;
                        borderStroke3 = borderStroke2;
                        modifier2 = modifier;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1470292106, i7, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:516)");
                    }
                    int i12 = i7 >> 9;
                    int i13 = (i12 & 14) | ((i7 << 3) & 112) | (i12 & 896);
                    boolean z6 = z4;
                    Modifier modifier5 = modifier2;
                    IconToggleButtonColors iconToggleButtonColors3 = iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m9878Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, C14762.INSTANCE, 1, null), z6, shape2, iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc.containerColor$material3_release(z4, z, composerStartRestartGroup, i13).getValue().m11350unboximpl(), iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc.contentColor$material3_release(z4, z, composerStartRestartGroup, i13).getValue().m11350unboximpl(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14773(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1207657396, i14, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:527)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m10558getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer3, 0);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (64638 & i7) | ((i7 << 9) & 1879048192), ((i7 >> 21) & 14) | 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape2;
                    borderStroke4 = borderStroke3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z5 = z6;
                    modifier3 = modifier5;
                    iconToggleButtonColors2 = iconToggleButtonColors3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton.4
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ BorderStroke $border;
                        public final /* synthetic */ boolean $checked;
                        public final /* synthetic */ IconToggleButtonColors $colors;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
                        public final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14784(boolean z7, Function1<? super Boolean, Unit> function12, Modifier modifier32, boolean z52, Shape shape32, IconToggleButtonColors iconToggleButtonColors22, BorderStroke borderStroke42, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function22, int i14, int i22) {
                            super(2);
                            z = z7;
                            function1 = function12;
                            modifier = modifier32;
                            z = z52;
                            shape = shape32;
                            iconToggleButtonColors = iconToggleButtonColors22;
                            borderStroke = borderStroke42;
                            mutableInteractionSource = mutableInteractionSource32;
                            function2 = function22;
                            i = i14;
                            i = i22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i14) {
                            IconButtonKt.OutlinedIconToggleButton(z, function1, modifier, z, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z3 = z2;
            if ((i14 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i14) == 0) {
            }
            if ((1572864 & i14) == 0) {
            }
            i5 = i22 & 128;
            if (i5 != 0) {
            }
            if ((i22 & 256) != 0) {
            }
            if ((38347923 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i14 & 1) != 0) {
                    if (i8 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i22 & 16) != 0) {
                    }
                    if ((i22 & 32) == 0) {
                    }
                    if ((i22 & 64) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    shape2 = outlinedShape;
                    borderStroke3 = borderStroke2;
                    modifier2 = modifier4;
                    z4 = z3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i7 >> 9;
                    int i132 = (i122 & 14) | ((i7 << 3) & 112) | (i122 & 896);
                    boolean z62 = z4;
                    Modifier modifier52 = modifier2;
                    IconToggleButtonColors iconToggleButtonColors32 = iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m9878Surfaced85dljk(z7, function12, SemanticsModifierKt.semantics$default(modifier2, false, C14762.INSTANCE, 1, null), z62, shape2, iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc.containerColor$material3_release(z4, z7, composerStartRestartGroup, i132).getValue().m11350unboximpl(), iconToggleButtonColorsM9494outlinedIconToggleButtonColors5tl4gsc.contentColor$material3_release(z4, z7, composerStartRestartGroup, i132).getValue().m11350unboximpl(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton.3
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C14773(Function2<? super Composer, ? super Integer, Unit> function22) {
                            super(2);
                            function2 = function22;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1207657396, i14, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:527)");
                                }
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m10558getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function22.invoke(composer3, 0);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (64638 & i7) | ((i7 << 9) & 1879048192), ((i7 >> 21) & 14) | 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape32 = shape2;
                    borderStroke42 = borderStroke3;
                    mutableInteractionSource32 = mutableInteractionSource2;
                    z52 = z62;
                    modifier32 = modifier52;
                    iconToggleButtonColors22 = iconToggleButtonColors32;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 8;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((i14 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i14) == 0) {
        }
        if ((1572864 & i14) == 0) {
        }
        i5 = i22 & 128;
        if (i5 != 0) {
        }
        if ((i22 & 256) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2 */
    /* loaded from: classes.dex */
    public static final class C14762 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C14762 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12994getCheckboxo7Vup1c());
        }
    }

    /* compiled from: IconButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$OutlinedIconToggleButton$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1001:1\n69#2,5:1002\n74#2:1035\n78#2:1040\n78#3,11:1007\n91#3:1039\n456#4,8:1018\n464#4,3:1032\n467#4,3:1036\n3737#5,6:1026\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$OutlinedIconToggleButton$3\n*L\n528#1:1002,5\n528#1:1035\n528#1:1040\n528#1:1007,11\n528#1:1039\n528#1:1018,8\n528#1:1032,3\n528#1:1036,3\n528#1:1026,6\n*E\n"})
    /* renamed from: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3 */
    /* loaded from: classes.dex */
    public static final class C14773 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14773(Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
            invoke(composer3, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer3, int i14) {
            if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1207657396, i14, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:527)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m10558getContainerSizeD9Ej5fM());
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function22 = function2;
                composer3.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                composer3.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer3, 0);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer3.skipToGroupEnd();
        }
    }
}
