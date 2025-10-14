package com.blackhub.bronline.game.gui.familysystem.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesRatingItemBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyTopData;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyRatingAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FamilyRatingAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<FamilyTopData> familyTopList;

    @Nullable
    public final JNIActivity mainActivity;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public FamilyRatingAdapter(@NotNull List<FamilyTopData> familyTopList, @Nullable JNIActivity jNIActivity) {
        Intrinsics.checkNotNullParameter(familyTopList, "familyTopList");
        this.familyTopList = familyTopList;
        this.mainActivity = jNIActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FamiliesRatingItemBinding familiesRatingItemBindingInflate = FamiliesRatingItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(familiesRatingItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, familiesRatingItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.familyTopList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.familyTopList.size();
    }

    /* compiled from: FamilyRatingAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyRatingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesRatingItemBinding;", "(Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyRatingAdapter;Lcom/blackhub/bronline/databinding/FamiliesRatingItemBinding;)V", "bind", "", "thisFamily", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyTopData;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FamiliesRatingItemBinding binding;
        public final /* synthetic */ FamilyRatingAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FamilyRatingAdapter familyRatingAdapter, FamiliesRatingItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = familyRatingAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull FamilyTopData thisFamily) {
            Intrinsics.checkNotNullParameter(thisFamily, "thisFamily");
            FamiliesRatingItemBinding familiesRatingItemBinding = this.binding;
            FamilyRatingAdapter familyRatingAdapter = this.this$0;
            familiesRatingItemBinding.topPosition.setText(String.valueOf(thisFamily.getPosition()));
            familiesRatingItemBinding.familyNick.setText(thisFamily.getFamilyName());
            familiesRatingItemBinding.familyRep.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(thisFamily.getFamilyRep())));
            familiesRatingItemBinding.valueCaptured.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(thisFamily.getFamilyGlasses())));
            JNIActivity jNIActivity = familyRatingAdapter.mainActivity;
            if (jNIActivity != null) {
                boolean zIsClicked = thisFamily.isClicked();
                if (zIsClicked) {
                    this.binding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(R.color.dark_gray_blue, null));
                    if (thisFamily.getFamilyType() == 1) {
                        familiesRatingItemBinding.familyIcon.setImageResource(R.drawable.ic_sindycate_active);
                    } else {
                        familiesRatingItemBinding.familyIcon.setImageResource(R.drawable.ic_brigade_active);
                    }
                } else if (!zIsClicked) {
                    this.binding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(thisFamily.getBackgroundColor(), null));
                    if (thisFamily.getFamilyType() == 1) {
                        familiesRatingItemBinding.familyIcon.setImageResource(R.drawable.ic_sindycate_inactive);
                    } else {
                        familiesRatingItemBinding.familyIcon.setImageResource(R.drawable.ic_brigade_inactive);
                    }
                }
            }
            familiesRatingItemBinding.leftIcon.setImageResource(thisFamily.getLeftIcon());
            familiesRatingItemBinding.rightIcon.setImageResource(thisFamily.getRightIcon());
            familiesRatingItemBinding.familyNick.setSelected(true);
            familiesRatingItemBinding.familyRep.setSelected(true);
            familiesRatingItemBinding.valueCaptured.setSelected(true);
        }
    }

    public final void setCheckOnlyElement(int checkedPosition) {
        int size = this.familyTopList.size();
        for (int i = 0; i < size; i++) {
            if (this.familyTopList.get(i).isClicked() && i != checkedPosition) {
                this.familyTopList.get(i).setClicked(false);
                notifyItemChanged(i);
            }
        }
    }
}

