package com.blackhub.bronline.game.gui.tuning.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningDiagnosticItemBinding;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningDetailsInDiagnosticAdapter.kt */
@StabilityInferred(parameters = 0)
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes3.dex */
public final class TuningDetailsInDiagnosticAdapter extends RecyclerView.Adapter<DiagnosticHolder> {
    public static final int $stable = 8;

    @NotNull
    public List<TuningDetailDiagnosticItemObj> currentItems = CollectionsKt__CollectionsKt.emptyList();

    @Nullable
    public final OnClickDetailInDiagnosticItem onClickDetailItem;
    public int statusOfDiagnostic;

    /* compiled from: TuningDetailsInDiagnosticAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsInDiagnosticAdapter$OnClickDetailInDiagnosticItem;", "", "clickInDiagnostic", "", "detailsItem", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningDetailDiagnosticItemObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface OnClickDetailInDiagnosticItem {
        void clickInDiagnostic(@NotNull TuningDetailDiagnosticItemObj detailsItem, int getPosition, @Nullable View view);
    }

    public TuningDetailsInDiagnosticAdapter(@Nullable OnClickDetailInDiagnosticItem onClickDetailInDiagnosticItem) {
        this.onClickDetailItem = onClickDetailInDiagnosticItem;
    }

    public final void setItems(@NotNull List<TuningDetailDiagnosticItemObj> lDetailsItems) {
        Intrinsics.checkNotNullParameter(lDetailsItems, "lDetailsItems");
        this.currentItems = lDetailsItems;
    }

    public final void setStatusOfDiagnostic(int newStatus) {
        this.statusOfDiagnostic = newStatus;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DiagnosticHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningDiagnosticItemBinding tuningDiagnosticItemBindingInflate = TuningDiagnosticItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tuningDiagnosticItemBindingInflate, "inflate(...)");
        return new DiagnosticHolder(this, tuningDiagnosticItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DiagnosticHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.currentItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.currentItems.size();
    }

    /* compiled from: TuningDetailsInDiagnosticAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsInDiagnosticAdapter$DiagnosticHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningDiagnosticItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsInDiagnosticAdapter;Lcom/blackhub/bronline/databinding/TuningDiagnosticItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningDetailDiagnosticItemObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class DiagnosticHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningDiagnosticItemBinding binding;
        public final /* synthetic */ TuningDetailsInDiagnosticAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiagnosticHolder(@NotNull TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter, TuningDiagnosticItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningDetailsInDiagnosticAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final TuningDetailDiagnosticItemObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TuningDiagnosticItemBinding tuningDiagnosticItemBinding = this.binding;
            final TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = this.this$0;
            tuningDiagnosticItemBinding.iconDetailsInDiagnostic.setImageDrawable(Useful.INSTANCE.getDrawableByName(item.getResName()));
            if (!item.getIsChecked()) {
                tuningDiagnosticItemBinding.bgViewDetailInDiagnostic.setBackground(ContextCompat.getDrawable(tuningDiagnosticItemBinding.getRoot().getContext(), R.drawable.tuning_bg_detail_not_check));
                tuningDiagnosticItemBinding.bgHeaderDetailInDiagnostic.setBackground(ContextCompat.getDrawable(tuningDiagnosticItemBinding.getRoot().getContext(), R.drawable.tuning_border_detail_not_check_item));
            } else {
                tuningDiagnosticItemBinding.bgViewDetailInDiagnostic.setBackground(ContextCompat.getDrawable(tuningDiagnosticItemBinding.getRoot().getContext(), R.drawable.tuning_bg_detail_check));
                tuningDiagnosticItemBinding.bgHeaderDetailInDiagnostic.setBackground(ContextCompat.getDrawable(tuningDiagnosticItemBinding.getRoot().getContext(), R.drawable.tuning_border_detail_check_item));
            }
            tuningDiagnosticItemBinding.nameDetailInDiagnostic.setText(item.getNameDetail());
            tuningDiagnosticItemBinding.valueStateDetailInDiagnostic.setText(item.getValueState() + "%");
            tuningDiagnosticItemBinding.valueCostDetailInDiagnostic.setText(String.valueOf(item.getCost()));
            tuningDiagnosticItemBinding.iconDetailInDiagnostic.setImageResource(R.drawable.tuning_icon_gold_in_details);
            if (tuningDetailsInDiagnosticAdapter.statusOfDiagnostic == 0) {
                tuningDiagnosticItemBinding.iconStateDetailInDiagnostic.setImageResource(R.drawable.tuning_icon_state_diagnostic_noactual);
                tuningDiagnosticItemBinding.valueStateDetailInDiagnostic.setTextColor(ContextCompat.getColor(tuningDiagnosticItemBinding.getRoot().getContext(), R.color.orange));
            } else {
                tuningDiagnosticItemBinding.iconStateDetailInDiagnostic.setImageResource(R.drawable.tuning_icon_state_diagnostic_actual);
                tuningDiagnosticItemBinding.valueStateDetailInDiagnostic.setTextColor(ContextCompat.getColor(tuningDiagnosticItemBinding.getRoot().getContext(), R.color.light_green));
            }
            tuningDiagnosticItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter$DiagnosticHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TuningDetailsInDiagnosticAdapter.DiagnosticHolder.bind$lambda$1$lambda$0(tuningDetailsInDiagnosticAdapter, item, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(TuningDetailsInDiagnosticAdapter this$0, TuningDetailDiagnosticItemObj item, DiagnosticHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            OnClickDetailInDiagnosticItem onClickDetailInDiagnosticItem = this$0.onClickDetailItem;
            if (onClickDetailInDiagnosticItem != null) {
                onClickDetailInDiagnosticItem.clickInDiagnostic(item, this$1.getBindingAdapterPosition(), view);
            }
        }
    }

    public final void setOnlyItemClickable(int getPosition) {
        int size = this.currentItems.size();
        for (int i = 0; i < size; i++) {
            if (this.currentItems.get(i).getIsChecked() && i != getPosition) {
                this.currentItems.get(i).setChecked(false);
                notifyItemChanged(i);
            }
        }
    }
}

