package com.blackhub.bronline.game.gui.tuning.adapters;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningColorItemBinding;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningColorAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TuningColorAdapter extends RecyclerView.Adapter<ColorHolder> {
    public static final int $stable = 8;

    @Nullable
    public final OnClickColorItem lClickColorItem;

    @NotNull
    public List<CarColorItem> lColorList = CollectionsKt__CollectionsKt.emptyList();

    /* compiled from: TuningColorAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter$OnClickColorItem;", "", "click", "", "colorItem", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public interface OnClickColorItem {
        void click(@NotNull CarColorItem colorItem, int getPosition, @Nullable View view);
    }

    public TuningColorAdapter(@Nullable OnClickColorItem onClickColorItem) {
        this.lClickColorItem = onClickColorItem;
    }

    public final void setColorItems(@NotNull List<CarColorItem> lColorList) {
        Intrinsics.checkNotNullParameter(lColorList, "lColorList");
        this.lColorList = lColorList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initAdapter() {
        notifyDataSetChanged();
    }

    public final void updateStartColors(@NotNull List<Integer> newAndOldStartColorPos) {
        Intrinsics.checkNotNullParameter(newAndOldStartColorPos, "newAndOldStartColorPos");
        Iterator<Integer> it = newAndOldStartColorPos.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue >= 0 && iIntValue < this.lColorList.size()) {
                notifyItemChanged(iIntValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ColorHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningColorItemBinding tuningColorItemBindingInflate = TuningColorItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tuningColorItemBindingInflate, "inflate(...)");
        return new ColorHolder(this, tuningColorItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ColorHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lColorList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.lColorList.size();
    }

    /* compiled from: TuningColorAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter$ColorHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningColorItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter;Lcom/blackhub/bronline/databinding/TuningColorItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ColorHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningColorItemBinding binding;
        public final /* synthetic */ TuningColorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorHolder(@NotNull TuningColorAdapter tuningColorAdapter, TuningColorItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningColorAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final CarColorItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TuningColorItemBinding tuningColorItemBinding = this.binding;
            final TuningColorAdapter tuningColorAdapter = this.this$0;
            tuningColorItemBinding.tuningColorItemColor.setBackgroundColor(Color.parseColor(item.getColor()));
            if (item.getStartColor()) {
                tuningColorItemBinding.tuningColorItemCheckedStartColor.setVisibility(0);
            } else {
                tuningColorItemBinding.tuningColorItemCheckedStartColor.setVisibility(4);
            }
            if (!item.getSelected()) {
                tuningColorItemBinding.tuningColorItemBorder.setBackground(ContextCompat.getDrawable(this.binding.getRoot().getContext(), R.drawable.tuning_border_button_gray));
            } else {
                tuningColorItemBinding.tuningColorItemBorder.setBackground(ContextCompat.getDrawable(this.binding.getRoot().getContext(), R.drawable.tuning_border_button_white));
            }
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter$ColorHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TuningColorAdapter.ColorHolder.bind$lambda$1$lambda$0(tuningColorAdapter, item, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(TuningColorAdapter this$0, CarColorItem item, ColorHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            OnClickColorItem onClickColorItem = this$0.lClickColorItem;
            if (onClickColorItem != null) {
                onClickColorItem.click(item, this$1.getBindingAdapterPosition(), view);
            }
        }
    }

    public final void setOnlyColorClickable(int getPosition) {
        int size = this.lColorList.size();
        for (int i = 0; i < size; i++) {
            if (this.lColorList.get(i).getSelected() && i != getPosition) {
                this.lColorList.get(i).setSelected(false);
                notifyItemChanged(i);
            }
        }
    }
}

