package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsQuestsItemBinding;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsQuestsAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem;
import com.bless.client.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsQuestsAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter$FractionsQuestsViewHolder;", "fractionsQuests", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "(Ljava/util/List;)V", "onQuestItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "thisItem", "", "getOnQuestItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnQuestItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedItemPosition", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FractionsQuestsViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFractionsQuestsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FractionsQuestsAdapter.kt\ncom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n350#2,7:89\n*S KotlinDebug\n*F\n+ 1 FractionsQuestsAdapter.kt\ncom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter\n*L\n17#1:89,7\n*E\n"})
/* loaded from: classes3.dex */
public final class FractionsQuestsAdapter extends RecyclerView.Adapter<FractionsQuestsViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<FractionQuestsItem> fractionsQuests;
    public Function1<? super FractionQuestsItem, Unit> onQuestItemClickListener;
    public int selectedItemPosition;

    public FractionsQuestsAdapter(@NotNull List<FractionQuestsItem> fractionsQuests) {
        Intrinsics.checkNotNullParameter(fractionsQuests, "fractionsQuests");
        this.fractionsQuests = fractionsQuests;
        Iterator<FractionQuestsItem> it = fractionsQuests.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getIsClicked()) {
                break;
            } else {
                i++;
            }
        }
        this.selectedItemPosition = i;
    }

    @NotNull
    public final Function1<FractionQuestsItem, Unit> getOnQuestItemClickListener() {
        Function1 function1 = this.onQuestItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onQuestItemClickListener");
        return null;
    }

    public final void setOnQuestItemClickListener(@NotNull Function1<? super FractionQuestsItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onQuestItemClickListener = function1;
    }

    /* compiled from: FractionsQuestsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter$FractionsQuestsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsQuestsItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter;Lcom/blackhub/bronline/databinding/FractionsQuestsItemBinding;)V", "bind", "", "quest", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class FractionsQuestsViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FractionsQuestsItemBinding binding;
        public final /* synthetic */ FractionsQuestsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsQuestsViewHolder(@NotNull FractionsQuestsAdapter fractionsQuestsAdapter, FractionsQuestsItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsQuestsAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final FractionQuestsItem quest) {
            Intrinsics.checkNotNullParameter(quest, "quest");
            FractionsQuestsItemBinding fractionsQuestsItemBinding = this.binding;
            final FractionsQuestsAdapter fractionsQuestsAdapter = this.this$0;
            fractionsQuestsItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsQuestsAdapter$FractionsQuestsViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsQuestsAdapter.FractionsQuestsViewHolder.bind$lambda$2$lambda$0(fractionsQuestsAdapter, this, quest, view);
                }
            });
            TextView textView = fractionsQuestsItemBinding.questTitle;
            textView.setText(quest.getTitle());
            textView.setSelected(true);
            if (quest.getMoneyReward() == 0) {
                fractionsQuestsItemBinding.ivAward1.setVisibility(4);
            } else {
                fractionsQuestsItemBinding.ivAward1.setVisibility(0);
            }
            if (quest.getScoreReward() >= 0) {
                fractionsQuestsItemBinding.ivAward2.setImageResource(R.drawable.ic_gold_up);
            } else {
                fractionsQuestsItemBinding.ivAward2.setImageResource(R.drawable.ic_gold_down);
            }
        }

        public static final void bind$lambda$2$lambda$0(FractionsQuestsAdapter this$0, FractionsQuestsViewHolder this$1, FractionQuestsItem quest, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(quest, "$quest");
            if (this$0.selectedItemPosition != this$1.getAdapterPosition()) {
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                ((FractionQuestsItem) this$0.fractionsQuests.get(this$0.selectedItemPosition)).setClicked(false);
                this$0.selectedItemPosition = this$1.getAdapterPosition();
                quest.setClicked(true);
                this$0.notifyItemChanged(this$1.getAdapterPosition());
                this$0.getOnQuestItemClickListener().invoke(quest);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsQuestsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsQuestsItemBinding fractionsQuestsItemBindingInflate = FractionsQuestsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fractionsQuestsItemBindingInflate, "inflate(...)");
        return new FractionsQuestsViewHolder(this, fractionsQuestsItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsQuestsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.fractionsQuests.get(position));
        if (this.fractionsQuests.get(position).getIsClicked()) {
            holder.itemView.isSelected();
            View view = holder.itemView;
            view.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.bg_rectangle_blue_cr5));
        } else if (this.fractionsQuests.get(position).getScoreReward() >= 0) {
            View view2 = holder.itemView;
            view2.setBackground(ContextCompat.getDrawable(view2.getContext(), R.drawable.bg_rectangle_green27_cr5));
        } else {
            View view3 = holder.itemView;
            view3.setBackground(ContextCompat.getDrawable(view3.getContext(), R.drawable.bg_rectangle_red25_cr5));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.fractionsQuests.size();
    }
}
