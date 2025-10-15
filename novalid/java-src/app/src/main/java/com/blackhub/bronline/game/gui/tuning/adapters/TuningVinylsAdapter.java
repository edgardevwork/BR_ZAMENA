package com.blackhub.bronline.game.gui.tuning.adapters;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningDetailItemBinding;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.p017ui.UILayoutTuningDetailsList;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
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

/* compiled from: TuningVinylsAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002-.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0007J\u001c\u0010!\u001a\u00020 2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020\u001eH\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001eH\u0016J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u001eJ\u0014\u0010*\u001a\u00020 2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0014\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0014R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$ViewHolder;", "mainRoot", "Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList;", "onClickVinylItem", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$OnClickVinylItem;", "detailsListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "(Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList;Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$OnClickVinylItem;Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;)V", "bgDetailCheck", "Landroid/graphics/drawable/Drawable;", "getBgDetailCheck", "()Landroid/graphics/drawable/Drawable;", "bgDetailCheck$delegate", "Lkotlin/Lazy;", "bgDetailNotCheck", "getBgDetailNotCheck", "bgDetailNotCheck$delegate", "<set-?>", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "tuneVinylObjs", "getTuneVinylObjs", "()Ljava/util/List;", "vinylRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "getItemCount", "", "initVinyls", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnlyVinylClickable", "getPosition", "setVinyls", "updateStartVinyl", "positions", "OnClickVinylItem", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTuningVinylsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TuningVinylsAdapter.kt\ncom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n*L\n1#1,128:1\n26#2:129\n*S KotlinDebug\n*F\n+ 1 TuningVinylsAdapter.kt\ncom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter\n*L\n29#1:129\n*E\n"})
/* loaded from: classes3.dex */
public final class TuningVinylsAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: bgDetailCheck$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy bgDetailCheck;

    /* renamed from: bgDetailNotCheck$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy bgDetailNotCheck;

    @NotNull
    public final TuningDetailsListViewModel detailsListViewModel;

    @NotNull
    public final UILayoutTuningDetailsList mainRoot;

    @Nullable
    public final OnClickVinylItem onClickVinylItem;

    @NotNull
    public List<TuneVinylsObj> tuneVinylObjs;

    @NotNull
    public final ArrayMap<String, Bitmap> vinylRender;

    /* compiled from: TuningVinylsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$OnClickVinylItem;", "", "click", "", "tuneVinyl", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface OnClickVinylItem {
        void click(@NotNull TuneVinylsObj tuneVinyl, int getPosition, @Nullable View view);
    }

    public TuningVinylsAdapter(@NotNull UILayoutTuningDetailsList mainRoot, @Nullable OnClickVinylItem onClickVinylItem, @NotNull TuningDetailsListViewModel detailsListViewModel) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        Intrinsics.checkNotNullParameter(detailsListViewModel, "detailsListViewModel");
        this.mainRoot = mainRoot;
        this.onClickVinylItem = onClickVinylItem;
        this.detailsListViewModel = detailsListViewModel;
        this.tuneVinylObjs = CollectionsKt__CollectionsKt.emptyList();
        this.vinylRender = new ArrayMap<>();
        this.bgDetailNotCheck = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$bgDetailNotCheck$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ContextCompat.getDrawable(JNIActivity.getContext(), R.drawable.tuning_bg_detail_not_check);
            }
        });
        this.bgDetailCheck = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$bgDetailCheck$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ContextCompat.getDrawable(JNIActivity.getContext(), R.drawable.tuning_bg_detail_check);
            }
        });
    }

    @NotNull
    public final List<TuneVinylsObj> getTuneVinylObjs() {
        return this.tuneVinylObjs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getBgDetailNotCheck() {
        return (Drawable) this.bgDetailNotCheck.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getBgDetailCheck() {
        return (Drawable) this.bgDetailCheck.getValue();
    }

    public final void setVinyls(@NotNull List<TuneVinylsObj> tuneVinylObjs) {
        Intrinsics.checkNotNullParameter(tuneVinylObjs, "tuneVinylObjs");
        this.tuneVinylObjs = tuneVinylObjs;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initVinyls() {
        notifyDataSetChanged();
    }

    public final void updateStartVinyl(@NotNull List<Integer> positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Iterator<Integer> it = positions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue >= 0 && iIntValue < this.tuneVinylObjs.size()) {
                notifyItemChanged(iIntValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningDetailItemBinding tuningDetailItemBindingInflate = TuningDetailItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tuningDetailItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, tuningDetailItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.tuneVinylObjs.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.tuneVinylObjs.size();
    }

    /* compiled from: TuningVinylsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningDetailItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter;Lcom/blackhub/bronline/databinding/TuningDetailItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningDetailItemBinding binding;
        public final /* synthetic */ TuningVinylsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull TuningVinylsAdapter tuningVinylsAdapter, TuningDetailItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningVinylsAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final TuneVinylsObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            final TuningDetailItemBinding tuningDetailItemBinding = this.binding;
            final TuningVinylsAdapter tuningVinylsAdapter = this.this$0;
            tuningDetailItemBinding.nameDetail.setText(tuningDetailItemBinding.getRoot().getContext().getString(R.string.tuning_vinyl_title, Integer.valueOf(getBindingAdapterPosition() + 1)));
            Bitmap bitmap = (Bitmap) tuningVinylsAdapter.vinylRender.get(item.getNameVinyl());
            if (bitmap == null) {
                GameRender.getInstance().RequestTexture(item.getNameVinyl(), item.getId(), new GameRender.GameTextureListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$ViewHolder$$ExternalSyntheticLambda1
                    @Override // com.blackhub.bronline.game.GameRender.GameTextureListener
                    public final void OnTextureGet(int i, Bitmap bitmap2) {
                        TuningVinylsAdapter.ViewHolder.bind$lambda$3$lambda$1(tuningDetailItemBinding, tuningVinylsAdapter, item, i, bitmap2);
                    }
                });
            } else {
                tuningDetailItemBinding.iconDetails.setImageBitmap(bitmap);
            }
            if (!item.getSelected()) {
                tuningDetailItemBinding.bgViewDetail.setBackground(tuningVinylsAdapter.getBgDetailNotCheck());
                tuningDetailItemBinding.bgHeaderDetail.setBackground(ContextCompat.getDrawable(tuningDetailItemBinding.getRoot().getContext(), R.drawable.tuning_border_detail_not_check_item));
            } else {
                tuningDetailItemBinding.bgViewDetail.setBackground(tuningVinylsAdapter.getBgDetailCheck());
                tuningDetailItemBinding.bgHeaderDetail.setBackground(ContextCompat.getDrawable(tuningDetailItemBinding.getRoot().getContext(), R.drawable.tuning_border_detail_check_item));
            }
            LifecycleOwner viewLifecycleOwner = tuningVinylsAdapter.mainRoot.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new TuningVinylsAdapter$ViewHolder$bind$1$2(tuningVinylsAdapter, item, tuningDetailItemBinding, null));
            tuningDetailItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$ViewHolder$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TuningVinylsAdapter.ViewHolder.bind$lambda$3$lambda$2(tuningVinylsAdapter, item, this, view);
                }
            });
        }

        public static final void bind$lambda$3$lambda$1(final TuningDetailItemBinding this_with, final TuningVinylsAdapter this$0, final TuneVinylsObj item, int i, final Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TuningVinylsAdapter.ViewHolder.bind$lambda$3$lambda$1$lambda$0(this_with, bitmap, this$0, item);
                }
            });
        }

        public static final void bind$lambda$3$lambda$1$lambda$0(TuningDetailItemBinding this_with, Bitmap bitmap, TuningVinylsAdapter this$0, TuneVinylsObj item) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this_with.iconDetails.setImageBitmap(bitmap);
            this$0.vinylRender.put(item.getNameVinyl(), bitmap);
        }

        public static final void bind$lambda$3$lambda$2(TuningVinylsAdapter this$0, TuneVinylsObj item, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            OnClickVinylItem onClickVinylItem = this$0.onClickVinylItem;
            if (onClickVinylItem != null) {
                onClickVinylItem.click(item, this$1.getBindingAdapterPosition(), view);
            }
        }
    }

    public final void setOnlyVinylClickable(int getPosition) {
        int size = this.tuneVinylObjs.size();
        for (int i = 0; i < size; i++) {
            if (this.tuneVinylObjs.get(i).getSelected() && i != getPosition) {
                this.tuneVinylObjs.get(i).setSelected(false);
                notifyItemChanged(i);
            }
        }
    }
}
