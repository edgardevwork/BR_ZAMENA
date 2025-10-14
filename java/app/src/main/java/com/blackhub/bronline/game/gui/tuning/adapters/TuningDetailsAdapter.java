package com.blackhub.bronline.game.gui.tuning.adapters;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningDetailItemBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningDetailsAdapter.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTuningDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TuningDetailsAdapter.kt\ncom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes3.dex */
public final class TuningDetailsAdapter extends RecyclerView.Adapter<TuningDetailsHolder> {
    public static final int $stable = 8;
    public int carId;

    @Nullable
    public final OnClickDetailItem onClickDetailItem;

    @NotNull
    public List<TuneObj> lDetailsItems = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: bgDetailNotCheck$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy bgDetailNotCheck = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter$bgDetailNotCheck$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Drawable invoke() {
            return ContextCompat.getDrawable(JNIActivity.getContext(), R.drawable.tuning_bg_detail_not_check);
        }
    });

    /* renamed from: bgDetailCheck$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy bgDetailCheck = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter$bgDetailCheck$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Drawable invoke() {
            return ContextCompat.getDrawable(JNIActivity.getContext(), R.drawable.tuning_bg_detail_check);
        }
    });

    /* compiled from: TuningDetailsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter$OnClickDetailItem;", "", "click", "", "detailsItem", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface OnClickDetailItem {
        void click(@NotNull TuneObj detailsItem, int getPosition, @Nullable View view);
    }

    public TuningDetailsAdapter(@Nullable OnClickDetailItem onClickDetailItem) {
        this.onClickDetailItem = onClickDetailItem;
    }

    @NotNull
    public final List<TuneObj> getLDetailsItems() {
        return this.lDetailsItems;
    }

    public final Drawable getBgDetailNotCheck() {
        return (Drawable) this.bgDetailNotCheck.getValue();
    }

    public final Drawable getBgDetailCheck() {
        return (Drawable) this.bgDetailCheck.getValue();
    }

    public final void setItems(@NotNull List<TuneObj> lDetailsItems) {
        Intrinsics.checkNotNullParameter(lDetailsItems, "lDetailsItems");
        this.lDetailsItems = lDetailsItems;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initItems(int carId) {
        this.carId = carId;
        notifyDataSetChanged();
    }

    public final void updateItemStatus(@NotNull List<Integer> itemIds) {
        Object next;
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        Iterator<Integer> it = itemIds.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Iterator<T> it2 = this.lDetailsItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((TuneObj) next).getId() == iIntValue) {
                        break;
                    }
                }
            }
            TuneObj tuneObj = (TuneObj) next;
            if (tuneObj != null) {
                notifyItemChanged(this.lDetailsItems.indexOf(tuneObj));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TuningDetailsHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningDetailItemBinding tuningDetailItemBindingInflate = TuningDetailItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tuningDetailItemBindingInflate, "inflate(...)");
        return new TuningDetailsHolder(this, tuningDetailItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TuningDetailsHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lDetailsItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.lDetailsItems.size();
    }

    /* compiled from: TuningDetailsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter$TuningDetailsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningDetailItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter;Lcom/blackhub/bronline/databinding/TuningDetailItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class TuningDetailsHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningDetailItemBinding binding;
        public final /* synthetic */ TuningDetailsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuningDetailsHolder(@NotNull TuningDetailsAdapter tuningDetailsAdapter, TuningDetailItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningDetailsAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final TuneObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TuningDetailItemBinding tuningDetailItemBinding = this.binding;
            final TuningDetailsAdapter tuningDetailsAdapter = this.this$0;
            tuningDetailItemBinding.nameDetail.setText(item.getName());
            tuningDetailItemBinding.iconDetails.setImageDrawable(Useful.INSTANCE.getDrawableByName(tuningDetailsAdapter.updateIcon(tuningDetailsAdapter.carId, item)));
            if (!item.isChecked()) {
                tuningDetailItemBinding.bgViewDetail.setBackground(tuningDetailsAdapter.getBgDetailNotCheck());
                tuningDetailItemBinding.bgHeaderDetail.setBackground(ContextCompat.getDrawable(tuningDetailItemBinding.getRoot().getContext(), R.drawable.tuning_border_detail_not_check_item));
            } else {
                tuningDetailItemBinding.bgViewDetail.setBackground(tuningDetailsAdapter.getBgDetailCheck());
                tuningDetailItemBinding.bgHeaderDetail.setBackground(ContextCompat.getDrawable(tuningDetailItemBinding.getRoot().getContext(), R.drawable.tuning_border_detail_check_item));
            }
            int thisLocation = item.getThisLocation();
            if (thisLocation == 0) {
                tuningDetailItemBinding.valueCost.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(item.getCost())));
                if (item.getCurrency() == 0) {
                    tuningDetailItemBinding.iconValueCost.setImageResource(R.drawable.tuning_icon_gold_in_details);
                } else {
                    tuningDetailItemBinding.iconValueCost.setImageResource(R.drawable.tuning_icon_black_coin_in_details);
                }
            } else if (thisLocation == 1) {
                tuningDetailItemBinding.valueCost.setText(R.string.common_bought);
                tuningDetailItemBinding.iconValueCost.setImageResource(R.drawable.tuning_icon_bought_in_details);
            } else if (thisLocation == 2) {
                tuningDetailItemBinding.valueCost.setText(R.string.tuning_set_detail);
                tuningDetailItemBinding.iconValueCost.setImageResource(R.drawable.tuning_icon_check_in_details);
            }
            tuningDetailItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter$TuningDetailsHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TuningDetailsAdapter.TuningDetailsHolder.bind$lambda$1$lambda$0(tuningDetailsAdapter, item, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(TuningDetailsAdapter this$0, TuneObj item, TuningDetailsHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            OnClickDetailItem onClickDetailItem = this$0.onClickDetailItem;
            if (onClickDetailItem != null) {
                onClickDetailItem.click(item, this$1.getBindingAdapterPosition(), view);
            }
        }
    }

    public final String updateIcon(int currentCarId, TuneObj currentItem) {
        String imageId = currentItem.getImageId();
        if (currentItem.getType() != -1) {
            int size = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().size();
            for (int i = 0; i < size; i++) {
                int selector = currentItem.getSelector();
                TuningConstants tuningConstants = TuningConstants.INSTANCE;
                if (selector == tuningConstants.getActiveSelectorListForInfoBrake().get(i).intValue()) {
                    Iterator<Integer> it = tuningConstants.getElectronicCars().iterator();
                    while (it.hasNext()) {
                        if (currentCarId == it.next().intValue()) {
                            imageId = TuningConstants.INSTANCE.getResForElectronicCars().get(i);
                        } else {
                            imageId = TuningConstants.INSTANCE.getResForDVSCars().get(i);
                        }
                    }
                }
            }
        }
        return imageId;
    }

    public final void setOnlyDetailClickable(int getPosition) {
        int size = this.lDetailsItems.size();
        for (int i = 0; i < size; i++) {
            if (this.lDetailsItems.get(i).isChecked() && i != getPosition) {
                this.lDetailsItems.get(i).setChecked(false);
                notifyItemChanged(i);
            }
        }
    }
}

