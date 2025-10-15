package com.blackhub.bronline.game.gui.tuning.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningTypeItemBinding;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningTypeAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningTypeAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter$TuningHolder;", "lTuningTypes", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "onClickTuningType", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter$OnClickTuningType;", "(Ljava/util/List;Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter$OnClickTuningType;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickTuningType", "TuningHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TuningTypeAdapter extends RecyclerView.Adapter<TuningHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<TuneGuiNodeObj> lTuningTypes;

    @Nullable
    public final OnClickTuningType onClickTuningType;

    /* compiled from: TuningTypeAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter$OnClickTuningType;", "", "click", "", "tuningType", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface OnClickTuningType {
        void click(@NotNull TuneGuiNodeObj tuningType, int getPosition, @Nullable View view);
    }

    public TuningTypeAdapter(@NotNull List<TuneGuiNodeObj> lTuningTypes, @Nullable OnClickTuningType onClickTuningType) {
        Intrinsics.checkNotNullParameter(lTuningTypes, "lTuningTypes");
        this.lTuningTypes = lTuningTypes;
        this.onClickTuningType = onClickTuningType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TuningHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningTypeItemBinding tuningTypeItemBindingInflate = TuningTypeItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tuningTypeItemBindingInflate, "inflate(...)");
        return new TuningHolder(this, tuningTypeItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TuningHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lTuningTypes.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.lTuningTypes.size();
    }

    /* compiled from: TuningTypeAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter$TuningHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningTypeItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningTypeAdapter;Lcom/blackhub/bronline/databinding/TuningTypeItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SuppressLint({"ClickableViewAccessibility"})
    public final class TuningHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningTypeItemBinding binding;
        public final /* synthetic */ TuningTypeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuningHolder(@NotNull TuningTypeAdapter tuningTypeAdapter, TuningTypeItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningTypeAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final TuneGuiNodeObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            final TuningTypeItemBinding tuningTypeItemBinding = this.binding;
            final TuningTypeAdapter tuningTypeAdapter = this.this$0;
            tuningTypeItemBinding.titleTypeTuning.setText(item.getName());
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (bindingAdapterPosition != 0) {
                if (bindingAdapterPosition == tuningTypeAdapter.lTuningTypes.size() - 1) {
                    tuningTypeItemBinding.bgTitleTypeTuning.setBackground(ContextCompat.getDrawable(tuningTypeItemBinding.getRoot().getContext(), R.drawable.tuning_bg_last_title_type_tuning));
                } else {
                    tuningTypeItemBinding.bgTitleTypeTuning.setBackground(ContextCompat.getDrawable(tuningTypeItemBinding.getRoot().getContext(), R.drawable.tuning_bg_title_type_tuning));
                }
            } else {
                tuningTypeItemBinding.bgTitleTypeTuning.setBackground(ContextCompat.getDrawable(tuningTypeItemBinding.getRoot().getContext(), R.drawable.tuning_bg_first_title_type_tuning));
            }
            tuningTypeItemBinding.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningTypeAdapter$TuningHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return TuningTypeAdapter.TuningHolder.bind$lambda$1$lambda$0(tuningTypeItemBinding, tuningTypeAdapter, item, this, view, motionEvent);
                }
            });
        }

        public static final boolean bind$lambda$1$lambda$0(TuningTypeItemBinding this_with, TuningTypeAdapter this$0, TuneGuiNodeObj item, TuningHolder this$1, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            int action = motionEvent.getAction();
            if (action == 0) {
                this_with.bgClickTitle.setVisibility(0);
            } else if (action == 1) {
                OnClickTuningType onClickTuningType = this$0.onClickTuningType;
                if (onClickTuningType != null) {
                    onClickTuningType.click(item, this$1.getBindingAdapterPosition(), view);
                }
                this_with.bgClickTitle.setVisibility(4);
            } else if (action == 3) {
                this_with.bgClickTitle.setVisibility(4);
            }
            return true;
        }
    }
}
