package com.blackhub.bronline.game.p019ui.admintools.widget;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATSelectButton.kt */
@SourceDebugExtension({"SMAP\nATSelectButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ATSelectButton.kt\ncom/blackhub/bronline/game/ui/admintools/widget/ATSelectButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,68:1\n1116#2,6:69\n81#3:75\n107#3,2:76\n*S KotlinDebug\n*F\n+ 1 ATSelectButton.kt\ncom/blackhub/bronline/game/ui/admintools/widget/ATSelectButtonKt\n*L\n54#1:69,6\n36#1:75\n36#1:76,2\n*E\n"})
/* loaded from: classes.dex */
public final class ATSelectButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ATSelectButton(@Nullable Modifier modifier, @NotNull final String buttonText, int i, final boolean z, @NotNull final Function0<Unit> onGridItemClick, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier2;
        final int i6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(onGridItemClick, "onGridItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1044825497);
        if ((i3 & 2) != 0) {
            i4 = i2 | 48;
        } else if ((i2 & 112) == 0) {
            i4 = (composerStartRestartGroup.changed(buttonText) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 896) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((i2 & 57344) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onGridItemClick) ? 16384 : 8192;
            }
            if ((46801 & i4) == 9360 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = (i3 & 1) == 0 ? Modifier.INSTANCE : modifier;
                int i8 = i7 == 0 ? 3 : i5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1044825497, i4, -1, "com.blackhub.bronline.game.ui.admintools.widget.ATSelectButton (ATSelectButton.kt:26)");
                }
                Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt$ATSelectButton$isShadowVisible$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MutableState<Boolean> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    }
                }, composerStartRestartGroup, 3080, 6);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._88sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._44sdp, composerStartRestartGroup, 6));
                Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._74sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6));
                TextStyle textStyleM14841montserratMedium8spOr6ssp67j0QOw = TypographyStyle.INSTANCE.m14841montserratMedium8spOr6ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
                boolean z2 = !ATSelectButton$lambda$0(mutableState) && z;
                composerStartRestartGroup.startReplaceableGroup(-685374331);
                zChanged = ((i4 & 57344) == 16384) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt$ATSelectButton$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onGridItemClick.invoke();
                            ATSelectButtonKt.ATSelectButton$lambda$1(mutableState, true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8174sizeVpY3zN4, modifierM8174sizeVpY3zN42, buttonText, textStyleM14841montserratMedium8spOr6ssp67j0QOw, 0.0f, i8, null, null, null, 0.0f, 0L, 0.0f, brushM11297verticalGradient8A3gB4$default, null, null, 0.0f, 0.0f, z2, false, null, false, false, false, null, (Function0) objRememberedValue, composer2, ((i4 << 3) & 896) | ((i4 << 9) & 458752), 100663296, 0, 16379856);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                i6 = i8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                i6 = i5;
                modifier2 = modifier;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt.ATSelectButton.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i9) {
                        ATSelectButtonKt.ATSelectButton(modifier2, buttonText, i6, z, onGridItemClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        i5 = i;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((46801 & i4) == 9360) {
            if ((i3 & 1) == 0) {
            }
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt$ATSelectButton$isShadowVisible$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<Boolean> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                }
            }, composerStartRestartGroup, 3080, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM8174sizeVpY3zN43 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._88sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._44sdp, composerStartRestartGroup, 6));
            Modifier modifierM8174sizeVpY3zN422 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._74sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6));
            TextStyle textStyleM14841montserratMedium8spOr6ssp67j0QOw2 = TypographyStyle.INSTANCE.m14841montserratMedium8spOr6ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
            if (ATSelectButton$lambda$0(mutableState)) {
                composerStartRestartGroup.startReplaceableGroup(-685374331);
                zChanged = ((i4 & 57344) == 16384) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt$ATSelectButton$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onGridItemClick.invoke();
                            ATSelectButtonKt.ATSelectButton$lambda$1(mutableState, true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8174sizeVpY3zN43, modifierM8174sizeVpY3zN422, buttonText, textStyleM14841montserratMedium8spOr6ssp67j0QOw2, 0.0f, i8, null, null, null, 0.0f, 0L, 0.0f, brushM11297verticalGradient8A3gB4$default2, null, null, 0.0f, 0.0f, z2, false, null, false, false, false, null, (Function0) objRememberedValue, composer2, ((i4 << 3) & 896) | ((i4 << 9) & 458752), 100663296, 0, 16379856);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    i6 = i8;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void ATSelectButton$lambda$1(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ATSelectButton")
    public static final void PreviewATSelectButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1951642844);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951642844, i, -1, "com.blackhub.bronline.game.ui.admintools.widget.PreviewATSelectButton (ATSelectButton.kt:61)");
            }
            ATSelectButton(null, "Button Button Button Button Button Button Button Button ", 0, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt.PreviewATSelectButton.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 27696, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.widget.ATSelectButtonKt.PreviewATSelectButton.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ATSelectButtonKt.PreviewATSelectButton(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean ATSelectButton$lambda$0(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

