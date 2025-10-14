package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsTestingItemBinding;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsTestingAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingItem;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsTestingAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FractionsTestingAdapter extends RecyclerView.Adapter<FractionsTestingViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<FractionsTestingItem> list;
    public Function1<? super Integer, Unit> onItemClickListener;
    public int questionNumber;

    @NotNull
    public final List<FractionsTestingItem> getList() {
        return this.list;
    }

    public FractionsTestingAdapter(@NotNull List<FractionsTestingItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnItemClickListener() {
        Function1 function1 = this.onItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onItemClickListener");
        return null;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onItemClickListener = function1;
    }

    /* compiled from: FractionsTestingAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsTestingAdapter$FractionsTestingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsTestingItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsTestingAdapter;Lcom/blackhub/bronline/databinding/FractionsTestingItemBinding;)V", "bind", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class FractionsTestingViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FractionsTestingItemBinding binding;
        public final /* synthetic */ FractionsTestingAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsTestingViewHolder(@NotNull FractionsTestingAdapter fractionsTestingAdapter, FractionsTestingItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsTestingAdapter;
            this.binding = binding;
        }

        public final void bind() {
            FractionsTestingItemBinding fractionsTestingItemBinding = this.binding;
            final FractionsTestingAdapter fractionsTestingAdapter = this.this$0;
            fractionsTestingItemBinding.textViewAnswer.setText(fractionsTestingAdapter.getList().get(fractionsTestingAdapter.questionNumber).getTestingAnswers().get(getAdapterPosition()));
            fractionsTestingItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsTestingAdapter$FractionsTestingViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsTestingAdapter.FractionsTestingViewHolder.bind$lambda$1$lambda$0(fractionsTestingAdapter, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(FractionsTestingAdapter this$0, FractionsTestingViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.getList().get(this$0.questionNumber).getAnswerClicked() != this$1.getAdapterPosition()) {
                if (this$0.getList().get(this$0.questionNumber).getAnswerClicked() >= 0) {
                    this$0.notifyItemChanged(this$0.getList().get(this$0.questionNumber).getAnswerClicked());
                }
                this$0.getList().get(this$0.questionNumber).setAnswerClicked(this$1.getAdapterPosition());
                this$0.notifyItemChanged(this$1.getAdapterPosition());
                return;
            }
            this$0.getOnItemClickListener().invoke(Integer.valueOf(this$1.getAdapterPosition()));
            this$0.getList().get(this$0.questionNumber).setAnswerClicked(-1);
        }
    }

    public final void nextAnswersForQuestion(int count) {
        this.questionNumber = count;
        notifyItemRangeChanged(0, this.list.get(count).getTestingAnswers().size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsTestingViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsTestingItemBinding fractionsTestingItemBindingInflate = FractionsTestingItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fractionsTestingItemBindingInflate, "inflate(...)");
        return new FractionsTestingViewHolder(this, fractionsTestingItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsTestingViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind();
        if (this.list.get(this.questionNumber).getAnswerClicked() == position) {
            holder.itemView.isSelected();
            View view = holder.itemView;
            view.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.bg_rectangle_blue_cr5));
        } else {
            View view2 = holder.itemView;
            view2.setBackground(ContextCompat.getDrawable(view2.getContext(), R.drawable.bg_rectangle_white15_cr5));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.get(this.questionNumber).getTestingAnswers().size();
    }
}

