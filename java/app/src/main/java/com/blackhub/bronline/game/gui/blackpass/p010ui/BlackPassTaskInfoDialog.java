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

