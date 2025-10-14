package com.blackhub.bronline.launcher.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.LauncherDialogPrivacyBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LauncherUpdateAvailableDialog.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLauncherUpdateAvailableDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherUpdateAvailableDialog.kt\ncom/blackhub/bronline/launcher/dialogs/LauncherUpdateAvailableDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,52:1\n1#2:53\n41#3,2:54\n*S KotlinDebug\n*F\n+ 1 LauncherUpdateAvailableDialog.kt\ncom/blackhub/bronline/launcher/dialogs/LauncherUpdateAvailableDialog\n*L\n27#1:54,2\n*E\n"})
/* loaded from: classes4.dex */
public final class LauncherUpdateAvailableDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogPrivacyBinding binding;
    public Function0<Unit> onCancelButtonClickListener;
    public Function0<Unit> onOkButtonClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LauncherUpdateAvailableDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LauncherDialogPrivacyBinding launcherDialogPrivacyBindingInflate = LauncherDialogPrivacyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(launcherDialogPrivacyBindingInflate, "inflate(...)");
        this.binding = launcherDialogPrivacyBindingInflate;
    }

    @NotNull
    public final Function0<Unit> getOnOkButtonClickListener() {
        Function0<Unit> function0 = this.onOkButtonClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onOkButtonClickListener");
        return null;
    }

    public final void setOnOkButtonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onOkButtonClickListener = function0;
    }

    @NotNull
    public final Function0<Unit> getOnCancelButtonClickListener() {
        Function0<Unit> function0 = this.onCancelButtonClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onCancelButtonClickListener");
        return null;
    }

    public final void setOnCancelButtonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCancelButtonClickListener = function0;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        Activity activityScanForActivity = UtilsKt.scanForActivity(this._context);
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        setCancelable(false);
        LauncherDialogPrivacyBinding launcherDialogPrivacyBinding = this.binding;
        launcherDialogPrivacyBinding.textViewPrivacyPolicyTitle.setText(getContext().getText(R.string.launcher_update_launcher_message));
        launcherDialogPrivacyBinding.textViewPrivacyPolicyLink.setVisibility(8);
        launcherDialogPrivacyBinding.buttonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LauncherUpdateAvailableDialog.initListeners$lambda$3$lambda$1(this.f$0, view);
            }
        });
        launcherDialogPrivacyBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LauncherUpdateAvailableDialog.initListeners$lambda$3$lambda$2(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$3$lambda$1(final LauncherUpdateAvailableDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog$initListeners$2$1$1
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
                    this.this$0.dismiss();
                    this.this$0.getOnOkButtonClickListener().invoke();
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }

    public static final void initListeners$lambda$3$lambda$2(final LauncherUpdateAvailableDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog$initListeners$2$2$1
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
                    this.this$0.dismiss();
                    this.this$0.getOnCancelButtonClickListener().invoke();
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }
}

