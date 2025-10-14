package com.blackhub.bronline.game.gui.drivingschool.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DrivingSchoolQuestionsItemBinding;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolAnswersAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingAnswer;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrivingSchoolAnswersAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DrivingSchoolAnswersAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function2<? super Integer, ? super View, Unit> answerClickListener;

    @NotNull
    public List<DrivingAnswer> answers;

    @NotNull
    public final Context context;
    public int oldItemPos;

    public DrivingSchoolAnswersAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.answers = CollectionsKt__CollectionsKt.emptyList();
        this.oldItemPos = -1;
    }

    @NotNull
    public final Function2<Integer, View, Unit> getAnswerClickListener() {
        Function2 function2 = this.answerClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("answerClickListener");
        return null;
    }

    public final void setAnswerClickListener(@NotNull Function2<? super Integer, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.answerClickListener = function2;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initAnswers(@NotNull List<DrivingAnswer> answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.answers = answers;
        this.oldItemPos = -1;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DrivingSchoolQuestionsItemBinding drivingSchoolQuestionsItemBindingInflate = DrivingSchoolQuestionsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(drivingSchoolQuestionsItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, drivingSchoolQuestionsItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.answers.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.answers.size();
    }

    /* compiled from: DrivingSchoolAnswersAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DrivingSchoolQuestionsItemBinding;", "(Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter;Lcom/blackhub/bronline/databinding/DrivingSchoolQuestionsItemBinding;)V", "bind", "", "answer", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingAnswer;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DrivingSchoolQuestionsItemBinding binding;
        public final /* synthetic */ DrivingSchoolAnswersAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter, DrivingSchoolQuestionsItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = drivingSchoolAnswersAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull DrivingAnswer answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            DrivingSchoolQuestionsItemBinding drivingSchoolQuestionsItemBinding = this.binding;
            final DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = this.this$0;
            drivingSchoolQuestionsItemBinding.questionsText.setText(answer.getAnswersText());
            if (answer.isChecked()) {
                drivingSchoolQuestionsItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(drivingSchoolAnswersAdapter.context.getResources(), R.drawable.bg_rectangle_blue_cr8_t8_light_blue, null));
            } else {
                drivingSchoolQuestionsItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(drivingSchoolAnswersAdapter.context.getResources(), R.drawable.bg_rectangle_gray54_cr8, null));
            }
            drivingSchoolQuestionsItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolAnswersAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DrivingSchoolAnswersAdapter.ViewHolder.bind$lambda$1$lambda$0(drivingSchoolAnswersAdapter, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(DrivingSchoolAnswersAdapter this$0, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.answerClickListener != null) {
                Function2<Integer, View, Unit> answerClickListener = this$0.getAnswerClickListener();
                Integer numValueOf = Integer.valueOf(this$1.getBindingAdapterPosition());
                Intrinsics.checkNotNull(view);
                answerClickListener.invoke(numValueOf, view);
            }
        }
    }

    public final void setCheckedOnlyItem(int currentPos) {
        int i = this.oldItemPos;
        if (currentPos != i && i != -1 && currentPos != -1) {
            this.answers.get(i).setChecked(false);
            notifyItemChanged(this.oldItemPos);
        }
        if (currentPos != -1) {
            this.answers.get(currentPos).setChecked(true);
            this.oldItemPos = currentPos;
            notifyItemChanged(currentPos);
        }
    }
}

