package com.blackhub.bronline.game.p019ui.catchstreamer;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.RemoveKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.PlaceholderVerticalAlign;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.recyclerview.widget.FastScroller;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerUiState;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.VerticalRedBlackBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonFillKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.http.HttpStatus;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: RegistrationInCompetitionDialogUi.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a±\u0001\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, m7105d2 = {"PreviewRegistrationInCompetitionDialogContent", "", "(Landroidx/compose/runtime/Composer;I)V", "PreviewRegistrationInCompetitionDialogContentTablet", "RegistrationInCompetitionDialogContent", "modifier", "Landroidx/compose/ui/Modifier;", "openDialog", "Landroidx/compose/runtime/MutableState;", "", "state", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerUiState;", "textField", "", "isEmailValid", "isEnabledButtonBuy", "isEnabledButtonMinus", "isEnabledButtonPlus", "isShowErrorField", "Lkotlin/Function0;", "isShowErrorDonate", "onMinusClick", "onPlusClick", "onBuyClick", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerUiState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "RegistrationInCompetitionDialogUi", "viewModel", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel;Landroidx/compose/runtime/Composer;II)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRegistrationInCompetitionDialogUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegistrationInCompetitionDialogUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/RegistrationInCompetitionDialogUiKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n74#2:332\n69#3,5:333\n74#3:366\n78#3:377\n79#4,11:338\n92#4:376\n456#5,8:349\n464#5,3:363\n467#5,3:373\n3737#6,6:357\n1116#7,6:367\n*S KotlinDebug\n*F\n+ 1 RegistrationInCompetitionDialogUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/RegistrationInCompetitionDialogUiKt\n*L\n70#1:332\n158#1:333,5\n158#1:366\n158#1:377\n158#1:338,11\n158#1:376\n158#1:349,8\n158#1:363,3\n158#1:373,3\n158#1:357,6\n164#1:367,6\n*E\n"})
/* loaded from: classes2.dex */
public final class RegistrationInCompetitionDialogUiKt {

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$PreviewRegistrationInCompetitionDialogContent$1 */
    /* loaded from: classes.dex */
    public static final class C52991 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52991(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            RegistrationInCompetitionDialogUiKt.PreviewRegistrationInCompetitionDialogContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$PreviewRegistrationInCompetitionDialogContentTablet$1 */
    /* loaded from: classes.dex */
    public static final class C53001 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53001(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            RegistrationInCompetitionDialogUiKt.PreviewRegistrationInCompetitionDialogContentTablet(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$7 */
    /* loaded from: classes.dex */
    public static final class C53157 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MutableState<Boolean> $isEmailValid;
        public final /* synthetic */ boolean $isEnabledButtonBuy;
        public final /* synthetic */ boolean $isEnabledButtonMinus;
        public final /* synthetic */ boolean $isEnabledButtonPlus;
        public final /* synthetic */ Function0<Unit> $isShowErrorDonate;
        public final /* synthetic */ Function0<Unit> $isShowErrorField;
        public final /* synthetic */ Function0<Unit> $onBuyClick;
        public final /* synthetic */ Function0<Unit> $onMinusClick;
        public final /* synthetic */ Function0<Unit> $onPlusClick;
        public final /* synthetic */ MutableState<Boolean> $openDialog;
        public final /* synthetic */ CatchStreamerUiState $state;
        public final /* synthetic */ MutableState<String> $textField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53157(MutableState<Boolean> mutableState, CatchStreamerUiState catchStreamerUiState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i, int i2, int i3) {
            super(2);
            mutableState = mutableState;
            catchStreamerUiState = catchStreamerUiState;
            mutableState = mutableState2;
            mutableState = mutableState3;
            z = z;
            z = z2;
            z = z3;
            function0 = function0;
            function0 = function02;
            function0 = function03;
            function0 = function04;
            function0 = function05;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogContent(modifier, mutableState, catchStreamerUiState, mutableState, mutableState, z, z, z, function0, function0, function0, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$6 */
    /* loaded from: classes.dex */
    public static final class C53216 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MutableState<Boolean> $openDialog;
        public final /* synthetic */ CatchStreamerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53216(MutableState<Boolean> mutableState, CatchStreamerViewModel catchStreamerViewModel, int i, int i2) {
            super(2);
            mutableState = mutableState;
            catchStreamerViewModel = catchStreamerViewModel;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi(modifier, mutableState, catchStreamerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RegistrationInCompetitionDialogUi(@Nullable Modifier modifier, @NotNull MutableState<Boolean> openDialog, @NotNull CatchStreamerViewModel viewModel, @Nullable Composer composer, int i, int i2) {
        boolean zValidateNickName;
        Intrinsics.checkNotNullParameter(openDialog, "openDialog");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1445493858);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1445493858, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUi (RegistrationInCompetitionDialogUi.kt:68)");
        }
        View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        String strStringResource = StringResources_androidKt.stringResource(R.string.catch_streamer_enter_email_or_social, composerStartRestartGroup, 6);
        String strStringResource2 = StringResources_androidKt.stringResource(R.string.catch_streamer_if_not_money, composerStartRestartGroup, 6);
        CatchStreamerUiState catchStreamerUiState = (CatchStreamerUiState) FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
        MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$textField$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<String> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$isEmailOrNickValid$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<Boolean> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        boolean z = catchStreamerUiState.getDonate() >= catchStreamerUiState.getCurrentCost() * catchStreamerUiState.getSelectCountTickets();
        boolean z2 = catchStreamerUiState.getSelectCountTickets() > 1;
        boolean z3 = catchStreamerUiState.getDonate() >= catchStreamerUiState.getCurrentCost() * (catchStreamerUiState.getSelectCountTickets() + 1);
        if (((CharSequence) mutableState.getValue()).length() > 0) {
            if (StringsKt__StringsKt.contains$default((CharSequence) mutableState.getValue(), ObjectUtils.AT_SIGN, false, 2, (Object) null)) {
                zValidateNickName = StringExtensionKt.validateEmail((String) mutableState.getValue());
            } else {
                zValidateNickName = StringExtensionKt.validateNickName((String) mutableState.getValue());
            }
            mutableState2.setValue(Boolean.valueOf(zValidateNickName));
        }
        if (catchStreamerUiState.isPurchaseValid()) {
            openDialog.setValue(Boolean.FALSE);
            viewModel.setCleanCountTicket();
        }
        UsefulKt.hideSystemUI(view);
        RegistrationInCompetitionDialogContent(modifier2, openDialog, catchStreamerUiState, mutableState, mutableState2, z, z2, z3, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi.1
            public final /* synthetic */ String $errorFieldMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C53161(String strStringResource3) {
                super(0);
                str = strStringResource3;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                catchStreamerViewModel.showErrorMessage(str);
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi.2
            public final /* synthetic */ String $errorDonateMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C53172(String strStringResource22) {
                super(0);
                str = strStringResource22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                catchStreamerViewModel.showErrorMessage(str);
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi.3
            public C53183() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                catchStreamerViewModel.removeBuyTicket();
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi.4
            public C53194() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                catchStreamerViewModel.addBuyTicket();
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi.5
            public final /* synthetic */ CatchStreamerUiState $state;
            public final /* synthetic */ MutableState<String> $textField;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C53205(MutableState<String> mutableState3, CatchStreamerUiState catchStreamerUiState2) {
                super(0);
                mutableState = mutableState3;
                catchStreamerUiState = catchStreamerUiState2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                catchStreamerViewModel.buyTickets(mutableState.getValue(), catchStreamerUiState.getSelectCountTickets());
            }
        }, composerStartRestartGroup, i & 126, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi.6
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ MutableState<Boolean> $openDialog;
                public final /* synthetic */ CatchStreamerViewModel $viewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C53216(MutableState<Boolean> openDialog2, CatchStreamerViewModel viewModel2, int i3, int i22) {
                    super(2);
                    mutableState = openDialog2;
                    catchStreamerViewModel = viewModel2;
                    i = i3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi(modifier, mutableState, catchStreamerViewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$1 */
    /* loaded from: classes.dex */
    public static final class C53161 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String $errorFieldMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53161(String strStringResource3) {
            super(0);
            str = strStringResource3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            catchStreamerViewModel.showErrorMessage(str);
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$2 */
    /* loaded from: classes.dex */
    public static final class C53172 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String $errorDonateMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53172(String strStringResource22) {
            super(0);
            str = strStringResource22;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            catchStreamerViewModel.showErrorMessage(str);
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$3 */
    /* loaded from: classes.dex */
    public static final class C53183 extends Lambda implements Function0<Unit> {
        public C53183() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            catchStreamerViewModel.removeBuyTicket();
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$4 */
    /* loaded from: classes.dex */
    public static final class C53194 extends Lambda implements Function0<Unit> {
        public C53194() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            catchStreamerViewModel.addBuyTicket();
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogUi$5 */
    /* loaded from: classes.dex */
    public static final class C53205 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CatchStreamerUiState $state;
        public final /* synthetic */ MutableState<String> $textField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53205(MutableState<String> mutableState3, CatchStreamerUiState catchStreamerUiState2) {
            super(0);
            mutableState = mutableState3;
            catchStreamerUiState = catchStreamerUiState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            catchStreamerViewModel.buyTickets(mutableState.getValue(), catchStreamerUiState.getSelectCountTickets());
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$1 */
    /* loaded from: classes.dex */
    public static final class C53011 extends Lambda implements Function0<Unit> {
        public static final C53011 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$2 */
    /* loaded from: classes.dex */
    public static final class C53022 extends Lambda implements Function0<Unit> {
        public static final C53022 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$3 */
    /* loaded from: classes.dex */
    public static final class C53033 extends Lambda implements Function0<Unit> {
        public static final C53033 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$4 */
    /* loaded from: classes.dex */
    public static final class C53044 extends Lambda implements Function0<Unit> {
        public static final C53044 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RegistrationInCompetitionDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$5 */
    /* loaded from: classes.dex */
    public static final class C53055 extends Lambda implements Function0<Unit> {
        public static final C53055 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RegistrationInCompetitionDialogContent(@Nullable Modifier modifier, @NotNull final MutableState<Boolean> openDialog, @NotNull CatchStreamerUiState state, @NotNull final MutableState<String> textField, @NotNull MutableState<Boolean> isEmailValid, boolean z, final boolean z2, final boolean z3, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable Function0<Unit> function05, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Modifier modifier2;
        Function0<Unit> function09;
        Function0<Unit> function010;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(openDialog, "openDialog");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(isEmailValid, "isEmailValid");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1291243256);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(openDialog) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(state) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(textField) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(isEmailValid) ? 16384 : 8192;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else {
            if ((3670016 & i) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else {
                if ((29360128 & i) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                i5 = i3 & 256;
                if (i5 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i6 = i3 & 512;
                if (i6 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
                }
                i7 = i3 & 1024;
                if (i7 != 0) {
                    i8 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i8 = i2 | (composerStartRestartGroup.changedInstance(function03) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i8 |= 48;
                } else if ((i2 & 112) == 0) {
                    i8 |= composerStartRestartGroup.changedInstance(function04) ? 32 : 16;
                }
                int i12 = i8;
                i10 = i3 & 4096;
                if (i10 == 0) {
                    if ((i2 & 896) == 0) {
                        i12 |= composerStartRestartGroup.changedInstance(function05) ? 256 : 128;
                    }
                    if ((i4 & 1533589211) == 306717842 || (i12 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier;
                        Function0<Unit> function011 = i5 == 0 ? C53011.INSTANCE : function0;
                        Function0<Unit> function012 = i6 == 0 ? C53022.INSTANCE : function02;
                        Function0<Unit> function013 = i7 == 0 ? C53033.INSTANCE : function03;
                        Function0<Unit> function014 = i9 == 0 ? C53044.INSTANCE : function04;
                        Function0<Unit> function015 = i10 == 0 ? C53055.INSTANCE : function05;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1291243256, i4, i12, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent (RegistrationInCompetitionDialogUi.kt:131)");
                        }
                        StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                        final AnnotatedString registrationInCompetitionBlockSubtitle = stringResourceCompose.getRegistrationInCompetitionBlockSubtitle(composerStartRestartGroup, 6);
                        final AnnotatedString blockCostTicketBC = stringResourceCompose.getBlockCostTicketBC(state.getSelectCountTickets(), state.getCurrentCost(), composerStartRestartGroup, 384, 0);
                        final Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(StringResourceCompose.CATCH_STREAMER_TICKET_TAG, new InlineTextContent(new Placeholder(TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composerStartRestartGroup, 6)), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composerStartRestartGroup, 6)), PlaceholderVerticalAlign.INSTANCE.m13100getTextCenterJ6kI3mc(), null), ComposableSingletons$RegistrationInCompetitionDialogUiKt.INSTANCE.m14946getLambda1$app_siteRelease())));
                        boolean z5 = !isEmailValid.getValue().booleanValue() && textField.getValue().length() > 0;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        final Modifier modifier4 = modifier3;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String strStringResource = StringResources_androidKt.stringResource(R.string.catch_streamer_registration_in_the_competition, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(1907198848);
                        z4 = (i4 & 112) == 32;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$1$1
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
                                    openDialog.setValue(Boolean.FALSE);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function016 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        final int i13 = 50;
                        final boolean z6 = z5;
                        final Function0<Unit> function017 = function015;
                        final Function0<Unit> function018 = function011;
                        final Function0<Unit> function019 = function013;
                        final Function0<Unit> function020 = function014;
                        final Function0<Unit> function021 = function012;
                        composer2 = composerStartRestartGroup;
                        VerticalRedBlackBlockKt.VerticalRedBlackBlock(null, strStringResource, function016, ComposableLambdaKt.composableLambda(composer2, -527176825, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-527176825, i14, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:165)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    AnnotatedString annotatedString = registrationInCompetitionBlockSubtitle;
                                    final MutableState<String> mutableState = textField;
                                    final boolean z7 = z6;
                                    final Function0<Unit> function022 = function017;
                                    final Function0<Unit> function023 = function018;
                                    boolean z8 = z2;
                                    int i15 = i13;
                                    final Function0<Unit> function024 = function019;
                                    AnnotatedString annotatedString2 = blockCostTicketBC;
                                    Map<String, InlineTextContent> map = mapMapOf;
                                    final boolean z9 = z3;
                                    final Function0<Unit> function025 = function020;
                                    final Function0<Unit> function026 = function021;
                                    final Modifier modifier5 = modifier4;
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13), composer3, 0, 0, 131070);
                                    String value = mutableState.getValue();
                                    composer3.startReplaceableGroup(-818917021);
                                    boolean zChanged = composer3.changed(mutableState);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                                invoke2(str);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull String it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                mutableState.setValue(it);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) objRememberedValue2, PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.m8179widthInVpY3zN4$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._184sdp, composer3, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._25sdp, composer3, 6)), C2046Dp.m13666constructorimpl(8), 0.0f, 2, null), false, false, typographyStyle.m14787montserratBold10spOr8ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13391getEmailPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null), (KeyboardActions) null, true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(Color.INSTANCE.m11377getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer3, -271079417, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer4, int i16) {
                                            int i17;
                                            int i18;
                                            Composer composer5;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            if ((i16 & 14) == 0) {
                                                i17 = i16 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                            } else {
                                                i17 = i16;
                                            }
                                            if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-271079417, i17, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:190)");
                                                }
                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion6, ColorResources_androidKt.colorResource(R.color.black, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer4, 6)));
                                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                                MutableState<String> mutableState2 = mutableState;
                                                composer4.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(1039430550);
                                                if (mutableState2.getValue().length() == 0) {
                                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.catch_streamer_enter_email_or_social, composer4, 6);
                                                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion6, C2046Dp.m13666constructorimpl(8), 0.0f, 2, null);
                                                    TextAlign.Companion companion8 = TextAlign.INSTANCE;
                                                    i18 = i17;
                                                    composer5 = composer4;
                                                    TextKt.m10024Text4IGK_g(strStringResource2, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion8.m13558getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14787montserratBold10spOr8ssp67j0QOw(ColorResources_androidKt.colorResource(R.color.dark_gray, composer4, 6), companion8.m13558getCentere0LSkKk(), 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 12), composer4, 48, 3072, 56828);
                                                } else {
                                                    i18 = i17;
                                                    composer5 = composer4;
                                                }
                                                composer4.endReplaceableGroup();
                                                innerTextField.invoke(composer5, Integer.valueOf(i18 & 14));
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
                                    }), composer3, 907542528, 221184, 15512);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer3, 6));
                                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(912596536);
                                    boolean zChanged2 = composer3.changed(function024);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$1$1
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
                                                function024.invoke();
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer3.endReplaceableGroup();
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, z8, null, false, false, false, false, null, i15, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composer3, 1101662320, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$2
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i16) {
                                            if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1101662320, i16, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:224)");
                                                }
                                                IconKt.m9497Iconww6aTOc(RemoveKt.getRemove(Icons.INSTANCE.getDefault()), (String) null, BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(modifier5, PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.black, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6))), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3120, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 805306368, 3072, 3579);
                                    TextKt.m10025TextIbK3jfQ(annotatedString2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map, null, typographyStyle.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 98302);
                                    composer3.startReplaceableGroup(912597671);
                                    boolean zChanged3 = composer3.changed(z9) | composer3.changed(function025) | composer3.changed(function026);
                                    Object objRememberedValue4 = composer3.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$3$1
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
                                                if (z9) {
                                                    function025.invoke();
                                                } else {
                                                    function026.invoke();
                                                }
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer3.endReplaceableGroup();
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, z9, false, false, false, null, i15, 0L, null, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composer3, -88253401, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$4
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i16) {
                                            if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-88253401, i16, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:251)");
                                                }
                                                IconKt.m9497Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(modifier5, PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.black, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6))), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3120, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 805306368, 3072, 3567);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._135sdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._33sdp, composer3, 6));
                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_buy, composer3, 6);
                                    long jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer3, 6);
                                    float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer3, 6);
                                    composer3.startReplaceableGroup(-818912105);
                                    boolean zChanged4 = composer3.changed(z7) | composer3.changed(function022) | composer3.changed(function023);
                                    Object objRememberedValue5 = composer3.rememberedValue();
                                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$4$1
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
                                                if (z7) {
                                                    function022.invoke();
                                                } else {
                                                    function023.invoke();
                                                }
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer3.endReplaceableGroup();
                                    MainButtonFillKt.m15075MainButtonFilljAZ_Pg4(modifierM8174sizeVpY3zN4, strStringResource2, null, jColorResource, fDimensionResource, 0.0f, false, z7, false, (Function0) objRememberedValue5, composer3, 0, 356);
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_clicked_button_buy, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14841montserratMedium8spOr6ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13), composer3, 0, 0, 65534);
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
                        }), composer2, 3072, 1);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function06 = function013;
                        function07 = function014;
                        function08 = function011;
                        modifier2 = modifier4;
                        function09 = function012;
                        function010 = function015;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function08 = function0;
                        function09 = function02;
                        function06 = function03;
                        function010 = function05;
                        composer2 = composerStartRestartGroup;
                        function07 = function04;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogContent.7
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ MutableState<Boolean> $isEmailValid;
                            public final /* synthetic */ boolean $isEnabledButtonBuy;
                            public final /* synthetic */ boolean $isEnabledButtonMinus;
                            public final /* synthetic */ boolean $isEnabledButtonPlus;
                            public final /* synthetic */ Function0<Unit> $isShowErrorDonate;
                            public final /* synthetic */ Function0<Unit> $isShowErrorField;
                            public final /* synthetic */ Function0<Unit> $onBuyClick;
                            public final /* synthetic */ Function0<Unit> $onMinusClick;
                            public final /* synthetic */ Function0<Unit> $onPlusClick;
                            public final /* synthetic */ MutableState<Boolean> $openDialog;
                            public final /* synthetic */ CatchStreamerUiState $state;
                            public final /* synthetic */ MutableState<String> $textField;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C53157(final MutableState<Boolean> openDialog2, CatchStreamerUiState state2, final MutableState<String> textField2, MutableState<Boolean> isEmailValid2, boolean z7, final boolean z22, final boolean z32, Function0<Unit> function082, Function0<Unit> function092, Function0<Unit> function062, Function0<Unit> function072, Function0<Unit> function0102, int i14, int i22, int i32) {
                                super(2);
                                mutableState = openDialog2;
                                catchStreamerUiState = state2;
                                mutableState = textField2;
                                mutableState = isEmailValid2;
                                z = z7;
                                z = z22;
                                z = z32;
                                function0 = function082;
                                function0 = function092;
                                function0 = function062;
                                function0 = function072;
                                function0 = function0102;
                                i = i14;
                                i = i22;
                                i = i32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i14) {
                                RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogContent(modifier, mutableState, catchStreamerUiState, mutableState, mutableState, z, z, z, function0, function0, function0, function0, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i12 |= 384;
                if ((i4 & 1533589211) == 306717842) {
                    if (i11 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    StringResourceCompose stringResourceCompose2 = StringResourceCompose.INSTANCE;
                    final AnnotatedString registrationInCompetitionBlockSubtitle2 = stringResourceCompose2.getRegistrationInCompetitionBlockSubtitle(composerStartRestartGroup, 6);
                    final AnnotatedString blockCostTicketBC2 = stringResourceCompose2.getBlockCostTicketBC(state2.getSelectCountTickets(), state2.getCurrentCost(), composerStartRestartGroup, 384, 0);
                    final Map<String, InlineTextContent> mapMapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(StringResourceCompose.CATCH_STREAMER_TICKET_TAG, new InlineTextContent(new Placeholder(TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composerStartRestartGroup, 6)), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._18ssp, composerStartRestartGroup, 6)), PlaceholderVerticalAlign.INSTANCE.m13100getTextCenterJ6kI3mc(), null), ComposableSingletons$RegistrationInCompetitionDialogUiKt.INSTANCE.m14946getLambda1$app_siteRelease())));
                    if (isEmailValid2.getValue().booleanValue()) {
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        final Modifier modifier42 = modifier3;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            String strStringResource2 = StringResources_androidKt.stringResource(R.string.catch_streamer_registration_in_the_competition, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(1907198848);
                            if ((i4 & 112) == 32) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$1$1
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
                                        openDialog2.setValue(Boolean.FALSE);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                Function0 function0162 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                final int i132 = 50;
                                final boolean z62 = z5;
                                final Function0<Unit> function0172 = function015;
                                final Function0<Unit> function0182 = function011;
                                final Function0<Unit> function0192 = function013;
                                final Function0<Unit> function0202 = function014;
                                final Function0<Unit> function0212 = function012;
                                composer2 = composerStartRestartGroup;
                                VerticalRedBlackBlockKt.VerticalRedBlackBlock(null, strStringResource2, function0162, ComposableLambdaKt.composableLambda(composer2, -527176825, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i14) {
                                        if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-527176825, i14, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:165)");
                                            }
                                            Modifier.Companion companion22 = Modifier.INSTANCE;
                                            Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                                            Alignment.Companion companion3 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                            AnnotatedString annotatedString = registrationInCompetitionBlockSubtitle2;
                                            final MutableState<String> mutableState = textField2;
                                            final boolean z7 = z62;
                                            final Function0<Unit> function022 = function0172;
                                            final Function0<Unit> function023 = function0182;
                                            boolean z8 = z22;
                                            int i15 = i132;
                                            final Function0<Unit> function024 = function0192;
                                            AnnotatedString annotatedString2 = blockCostTicketBC2;
                                            Map<String, InlineTextContent> map = mapMapOf2;
                                            final boolean z9 = z32;
                                            final Function0<Unit> function025 = function0202;
                                            final Function0<Unit> function026 = function0212;
                                            final Modifier modifier5 = modifier42;
                                            composer3.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composer3, 54);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default22);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor22);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                            TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                            TextKt.m10025TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13), composer3, 0, 0, 131070);
                                            String value = mutableState.getValue();
                                            composer3.startReplaceableGroup(-818917021);
                                            boolean zChanged = composer3.changed(mutableState);
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                                        invoke2(str);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull String it) {
                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                        mutableState.setValue(it);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer3.endReplaceableGroup();
                                            BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) objRememberedValue2, PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.m8179widthInVpY3zN4$default(companion22, PrimitiveResources_androidKt.dimensionResource(R.dimen._184sdp, composer3, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._25sdp, composer3, 6)), C2046Dp.m13666constructorimpl(8), 0.0f, 2, null), false, false, typographyStyle.m14787montserratBold10spOr8ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13391getEmailPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null), (KeyboardActions) null, true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(Color.INSTANCE.m11377getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer3, -271079417, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @Composable
                                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer4, int i16) {
                                                    int i17;
                                                    int i18;
                                                    Composer composer5;
                                                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                    if ((i16 & 14) == 0) {
                                                        i17 = i16 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                                    } else {
                                                        i17 = i16;
                                                    }
                                                    if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-271079417, i17, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:190)");
                                                        }
                                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                                        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion6, ColorResources_androidKt.colorResource(R.color.black, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer4, 6)));
                                                        Alignment center22 = Alignment.INSTANCE.getCenter();
                                                        MutableState<String> mutableState2 = mutableState;
                                                        composer4.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer4, 6);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor3);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1039430550);
                                                        if (mutableState2.getValue().length() == 0) {
                                                            String strStringResource22 = StringResources_androidKt.stringResource(R.string.catch_streamer_enter_email_or_social, composer4, 6);
                                                            Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion6, C2046Dp.m13666constructorimpl(8), 0.0f, 2, null);
                                                            TextAlign.Companion companion8 = TextAlign.INSTANCE;
                                                            i18 = i17;
                                                            composer5 = composer4;
                                                            TextKt.m10024Text4IGK_g(strStringResource22, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion8.m13558getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14787montserratBold10spOr8ssp67j0QOw(ColorResources_androidKt.colorResource(R.color.dark_gray, composer4, 6), companion8.m13558getCentere0LSkKk(), 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 12), composer4, 48, 3072, 56828);
                                                        } else {
                                                            i18 = i17;
                                                            composer5 = composer4;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        innerTextField.invoke(composer5, Integer.valueOf(i18 & 14));
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
                                            }), composer3, 907542528, 221184, 15512);
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer3, 6));
                                            Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                            composer3.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, centerVertically, composer3, 48);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion22);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            composer3.startReplaceableGroup(912596536);
                                            boolean zChanged2 = composer3.changed(function024);
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$1$1
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
                                                        function024.invoke();
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer3.endReplaceableGroup();
                                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, z8, null, false, false, false, false, null, i15, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composer3, 1101662320, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$2
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i16) {
                                                    if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1101662320, i16, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:224)");
                                                        }
                                                        IconKt.m9497Iconww6aTOc(RemoveKt.getRemove(Icons.INSTANCE.getDefault()), (String) null, BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(modifier5, PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.black, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6))), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3120, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 805306368, 3072, 3579);
                                            TextKt.m10025TextIbK3jfQ(annotatedString2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map, null, typographyStyle.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 98302);
                                            composer3.startReplaceableGroup(912597671);
                                            boolean zChanged3 = composer3.changed(z9) | composer3.changed(function025) | composer3.changed(function026);
                                            Object objRememberedValue4 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$3$1
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
                                                        if (z9) {
                                                            function025.invoke();
                                                        } else {
                                                            function026.invoke();
                                                        }
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer3.endReplaceableGroup();
                                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, z9, false, false, false, null, i15, 0L, null, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composer3, -88253401, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$3$4
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i16) {
                                                    if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-88253401, i16, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegistrationInCompetitionDialogUi.kt:251)");
                                                        }
                                                        IconKt.m9497Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(modifier5, PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.black, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6))), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3120, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 805306368, 3072, 3567);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion22, PrimitiveResources_androidKt.dimensionResource(R.dimen._135sdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._33sdp, composer3, 6));
                                            String strStringResource22 = StringResources_androidKt.stringResource(R.string.common_buy, composer3, 6);
                                            long jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer3, 6);
                                            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer3, 6);
                                            composer3.startReplaceableGroup(-818912105);
                                            boolean zChanged4 = composer3.changed(z7) | composer3.changed(function022) | composer3.changed(function023);
                                            Object objRememberedValue5 = composer3.rememberedValue();
                                            if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt$RegistrationInCompetitionDialogContent$6$2$1$4$1
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
                                                        if (z7) {
                                                            function022.invoke();
                                                        } else {
                                                            function023.invoke();
                                                        }
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer3.endReplaceableGroup();
                                            MainButtonFillKt.m15075MainButtonFilljAZ_Pg4(modifierM8174sizeVpY3zN4, strStringResource22, null, jColorResource, fDimensionResource, 0.0f, false, z7, false, (Function0) objRememberedValue5, composer3, 0, 356);
                                            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_clicked_button_buy, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14841montserratMedium8spOr6ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 13), composer3, 0, 0, 65534);
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
                                }), composer2, 3072, 1);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function062 = function013;
                                function072 = function014;
                                function082 = function011;
                                modifier2 = modifier42;
                                function092 = function012;
                                function0102 = function015;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i5 = i32 & 256;
            if (i5 != 0) {
            }
            i6 = i32 & 512;
            if (i6 != 0) {
            }
            i7 = i32 & 1024;
            if (i7 != 0) {
            }
            i9 = i32 & 2048;
            if (i9 != 0) {
            }
            int i122 = i8;
            i10 = i32 & 4096;
            if (i10 == 0) {
            }
            if ((i4 & 1533589211) == 306717842) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i32 & 128) == 0) {
        }
        i5 = i32 & 256;
        if (i5 != 0) {
        }
        i6 = i32 & 512;
        if (i6 != 0) {
        }
        i7 = i32 & 1024;
        if (i7 != 0) {
        }
        i9 = i32 & 2048;
        if (i9 != 0) {
        }
        int i1222 = i8;
        i10 = i32 & 4096;
        if (i10 == 0) {
        }
        if ((i4 & 1533589211) == 306717842) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview(apiLevel = 31, heightDp = HttpStatus.SC_LENGTH_REQUIRED, name = "PreviewRegistrationInCompetitionDialogContent", showBackground = true, widthDp = 914)
    public static final void PreviewRegistrationInCompetitionDialogContent(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1472445669);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1472445669, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewRegistrationInCompetitionDialogContent (RegistrationInCompetitionDialogUi.kt:299)");
            }
            RegistrationInCompetitionDialogContent(null, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null), true, true, true, null, null, null, null, null, composerStartRestartGroup, 14352384, 0, 7937);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.PreviewRegistrationInCompetitionDialogContent.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52991(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    RegistrationInCompetitionDialogUiKt.PreviewRegistrationInCompetitionDialogContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview(apiLevel = 28, heightDp = FastScroller.HIDE_DELAY_AFTER_DRAGGING_MS, name = "PreviewRegistrationInCompetitionDialogContentTablet", showBackground = true, widthDp = 2000)
    public static final void PreviewRegistrationInCompetitionDialogContentTablet(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1850877931);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1850877931, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewRegistrationInCompetitionDialogContentTablet (RegistrationInCompetitionDialogUi.kt:320)");
            }
            RegistrationInCompetitionDialogContent(null, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null), true, true, false, null, null, null, null, null, composerStartRestartGroup, 14352384, 0, 7937);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialogUiKt.PreviewRegistrationInCompetitionDialogContentTablet.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C53001(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    RegistrationInCompetitionDialogUiKt.PreviewRegistrationInCompetitionDialogContentTablet(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
