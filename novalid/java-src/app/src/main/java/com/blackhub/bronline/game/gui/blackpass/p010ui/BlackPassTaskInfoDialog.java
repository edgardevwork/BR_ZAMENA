package com.blackhub.bronline.game.gui.blackpass.p010ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.databinding.BlackPassDialogTaskInfoBinding;
import com.blackhub.bronline.game.common.DialogNoNavBar;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.bless.client.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: BlackPassTaskInfoDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u0014J&\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eR#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/ui/BlackPassTaskInfoDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anim", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getAnim", "()Landroid/view/animation/Animation;", "anim$delegate", "Lkotlin/Lazy;", "binding", "Lcom/blackhub/bronline/databinding/BlackPassDialogTaskInfoBinding;", "taskInfoDialogClickListener", "Lkotlin/Function1;", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "Lkotlin/ParameterName;", "name", "task", "", "getTaskInfoDialogClickListener", "()Lkotlin/jvm/functions/Function1;", "setTaskInfoDialogClickListener", "(Lkotlin/jvm/functions/Function1;)V", "closeDialog", "showTaskInfo", "isTracking", "", "clickTrackBtn", "Lkotlin/Function0;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class BlackPassTaskInfoDialog extends DialogNoNavBar {
    public static final int $stable = 8;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    @NotNull
    public final BlackPassDialogTaskInfoBinding binding;

    @NotNull
    public final Context context;
    public Function1<? super CommonTaskModel, Unit> taskInfoDialogClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassTaskInfoDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        BlackPassDialogTaskInfoBinding blackPassDialogTaskInfoBindingInflate = BlackPassDialogTaskInfoBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(blackPassDialogTaskInfoBindingInflate, "inflate(...)");
        this.binding = blackPassDialogTaskInfoBindingInflate;
        this.anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassTaskInfoDialog$anim$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(this.this$0.context, R.anim.button_click);
            }
        });
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
        }
        setContentView(blackPassDialogTaskInfoBindingInflate.getRoot());
    }

    public final Animation getAnim() {
        return (Animation) this.anim.getValue();
    }

    @NotNull
    public final Function1<CommonTaskModel, Unit> getTaskInfoDialogClickListener() {
        Function1 function1 = this.taskInfoDialogClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("taskInfoDialogClickListener");
        return null;
    }

    public final void setTaskInfoDialogClickListener(@NotNull Function1<? super CommonTaskModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.taskInfoDialogClickListener = function1;
    }

    public static /* synthetic */ void showTaskInfo$default(BlackPassTaskInfoDialog blackPassTaskInfoDialog, CommonTaskModel commonTaskModel, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        blackPassTaskInfoDialog.showTaskInfo(commonTaskModel, z, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTaskInfo(@NotNull final CommonTaskModel task, boolean isTracking, @NotNull final Function0<Unit> clickTrackBtn) {
        AnnotatedString description;
        String string;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(clickTrackBtn, "clickTrackBtn");
        BlackPassDialogTaskInfoBinding blackPassDialogTaskInfoBinding = this.binding;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) task.getDescription(), "(", 0, false, 6, (Object) null);
        if (iIndexOf$default != -1) {
            SpannableString spannableString = new SpannableString(task.getDescription());
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.context, R.color.yellow)), IntExtensionKt.getOrZero(Integer.valueOf(iIndexOf$default)), IntExtensionKt.getOrZero(Integer.valueOf(task.getDescription().length())), 33);
            description = spannableString;
        } else {
            description = task.getDescription();
        }
        blackPassDialogTaskInfoBinding.bpTaskHeader.setText(this.context.getString(R.string.black_pass_task_info_not_completed));
        blackPassDialogTaskInfoBinding.bpTaskName.setText(task.getTitle());
        blackPassDialogTaskInfoBinding.bpTaskDescription.setText(description);
        blackPassDialogTaskInfoBinding.bpTaskExp.setText(this.context.getString(R.string.black_pass_task_info_exp, Integer.valueOf(task.getAward())));
        if (task.getRublesReward() != null) {
            blackPassDialogTaskInfoBinding.bpTaskCoins.setText(this.context.getString(R.string.common_value_of_rubles_string, UsefulKt.getPriceWithDot(task.getRublesReward())));
        }
        AppCompatButton appCompatButton = blackPassDialogTaskInfoBinding.bpTaskTrack;
        if (isTracking) {
            string = this.context.getString(R.string.black_pass_tasks_do_not_track_bnt_text);
        } else {
            string = this.context.getString(R.string.common_track);
        }
        appCompatButton.setText(string);
        blackPassDialogTaskInfoBinding.bpTaskClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassTaskInfoDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassTaskInfoDialog.showTaskInfo$lambda$5$lambda$2(this.f$0, view);
            }
        });
        blackPassDialogTaskInfoBinding.bpTaskExch.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassTaskInfoDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassTaskInfoDialog.showTaskInfo$lambda$5$lambda$3(this.f$0, task, view);
            }
        });
        blackPassDialogTaskInfoBinding.bpTaskTrack.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.BlackPassTaskInfoDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackPassTaskInfoDialog.showTaskInfo$lambda$5$lambda$4(this.f$0, clickTrackBtn, view);
            }
        });
        show();
    }

    public static final void showTaskInfo$lambda$5$lambda$2(BlackPassTaskInfoDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void showTaskInfo$lambda$5$lambda$3(BlackPassTaskInfoDialog this$0, CommonTaskModel task, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "$task");
        view.startAnimation(this$0.getAnim());
        this$0.getTaskInfoDialogClickListener().invoke(task);
    }

    public static final void showTaskInfo$lambda$5$lambda$4(BlackPassTaskInfoDialog this$0, Function0 clickTrackBtn, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(clickTrackBtn, "$clickTrackBtn");
        view.startAnimation(this$0.getAnim());
        clickTrackBtn.invoke();
    }

    public final void closeDialog() {
        dismiss();
    }
}
