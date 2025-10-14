package com.blackhub.bronline.launcher.dialogs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.LauncherDialogPrivacyBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrivacyPolicyDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/dialogs/PrivacyPolicyDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/LauncherDialogPrivacyBinding;", "getContentView", "Landroid/view/View;", "initListeners", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyPolicyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyPolicyDialog.kt\ncom/blackhub/bronline/launcher/dialogs/PrivacyPolicyDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,64:1\n1#2:65\n41#3,2:66\n*S KotlinDebug\n*F\n+ 1 PrivacyPolicyDialog.kt\ncom/blackhub/bronline/launcher/dialogs/PrivacyPolicyDialog\n*L\n27#1:66,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PrivacyPolicyDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogPrivacyBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyPolicyDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LauncherDialogPrivacyBinding launcherDialogPrivacyBindingInflate = LauncherDialogPrivacyBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(launcherDialogPrivacyBindingInflate, "inflate(...)");
        this.binding = launcherDialogPrivacyBindingInflate;
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
        launcherDialogPrivacyBinding.textViewPrivacyPolicyLink.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyPolicyDialog.initListeners$lambda$4$lambda$1(this.f$0, view);
            }
        });
        launcherDialogPrivacyBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyPolicyDialog.initListeners$lambda$4$lambda$2(this.f$0, view);
            }
        });
        launcherDialogPrivacyBinding.buttonOk.setText(getContext().getString(R.string.common_ok));
        launcherDialogPrivacyBinding.buttonOk.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyPolicyDialog.initListeners$lambda$4$lambda$3(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$4$lambda$1(final PrivacyPolicyDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog$initListeners$2$1$1
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
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.this$0.getContext().getString(R.string.privacy_polyce_dialog_link)));
                    Activity ownerActivity = this.this$0.getOwnerActivity();
                    if (ownerActivity != null) {
                        ownerActivity.startActivity(intent);
                    }
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }

    public static final void initListeners$lambda$4$lambda$2(final PrivacyPolicyDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog$initListeners$2$2$1
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
                    Activity ownerActivity = this.this$0.getOwnerActivity();
                    if (ownerActivity != null) {
                        ownerActivity.finish();
                    }
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }

    public static final void initListeners$lambda$4$lambda$3(final PrivacyPolicyDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this$0.getTimeChecker().ifAccess(500L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog$initListeners$2$3$1
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
                    Preferences.putBoolean(this.this$0.getContext(), Preferences.PRIVACY, true);
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }
}
