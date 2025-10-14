package com.blackhub.bronline.launcher.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.LauncherDialogNotEnoughSpaceBinding;
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

/* compiled from: PhoneDoesntSupportGameDialog.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPhoneDoesntSupportGameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneDoesntSupportGameDialog.kt\ncom/blackhub/bronline/launcher/dialogs/PhoneDoesNotSupportGameDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,36:1\n1#2:37\n41#3,2:38\n*S KotlinDebug\n*F\n+ 1 PhoneDoesntSupportGameDialog.kt\ncom/blackhub/bronline/launcher/dialogs/PhoneDoesNotSupportGameDialog\n*L\n23#1:38,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PhoneDoesNotSupportGameDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogNotEnoughSpaceBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneDoesNotSupportGameDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LauncherDialogNotEnoughSpaceBinding launcherDialogNotEnoughSpaceBindingInflate = LauncherDialogNotEnoughSpaceBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(launcherDialogNotEnoughSpaceBindingInflate, "inflate(...)");
        this.binding = launcherDialogNotEnoughSpaceBindingInflate;
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
        setCancelable(false);
        Activity activityScanForActivity = UtilsKt.scanForActivity(this._context);
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        LauncherDialogNotEnoughSpaceBinding launcherDialogNotEnoughSpaceBinding = this.binding;
        launcherDialogNotEnoughSpaceBinding.textViewNotEnoughSpaceTitle.setText(getContext().getString(R.string.common_error));
        launcherDialogNotEnoughSpaceBinding.textViewNeedToFree.setText(getContext().getString(R.string.launcher_your_phone_is_low));
        launcherDialogNotEnoughSpaceBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.PhoneDoesNotSupportGameDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneDoesNotSupportGameDialog.initListeners$lambda$2$lambda$1(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$2$lambda$1(final PhoneDoesNotSupportGameDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.PhoneDoesNotSupportGameDialog$initListeners$2$1$1
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

