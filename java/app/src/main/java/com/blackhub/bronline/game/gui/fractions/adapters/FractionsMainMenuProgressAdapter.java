package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionProgressInOrganizationItemBinding;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsMainMenuProgressAdapter;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsMainMenuProgressAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FractionsMainMenuProgressAdapter extends RecyclerView.Adapter<FractionsMainMenuProgressViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<Integer> listOfImages;

    @NotNull
    public final List<String> listOfPositions;

    @NotNull
    public final List<Integer> listOfRanks;
    public Function0<Unit> onGetNewRankButtonClickListener;

    @NotNull
    public final List<Integer> rankProgress;

    public FractionsMainMenuProgressAdapter(@NotNull List<Integer> listOfRanks, @NotNull List<Integer> rankProgress, @NotNull List<Integer> listOfImages, @NotNull List<String> listOfPositions) {
        Intrinsics.checkNotNullParameter(listOfRanks, "listOfRanks");
        Intrinsics.checkNotNullParameter(rankProgress, "rankProgress");
        Intrinsics.checkNotNullParameter(listOfImages, "listOfImages");
        Intrinsics.checkNotNullParameter(listOfPositions, "listOfPositions");
        this.listOfRanks = listOfRanks;
        this.rankProgress = rankProgress;
        this.listOfImages = listOfImages;
        this.listOfPositions = listOfPositions;
    }

    @NotNull
    public final Function0<Unit> getOnGetNewRankButtonClickListener() {
        Function0<Unit> function0 = this.onGetNewRankButtonClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onGetNewRankButtonClickListener");
        return null;
    }

    public final void setOnGetNewRankButtonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onGetNewRankButtonClickListener = function0;
    }

    /* compiled from: FractionsMainMenuProgressAdapter.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J6\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\u001e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J&\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsMainMenuProgressAdapter$FractionsMainMenuProgressViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionProgressInOrganizationItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsMainMenuProgressAdapter;Lcom/blackhub/bronline/databinding/FractionProgressInOrganizationItemBinding;)V", "anim", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/blackhub/bronline/databinding/FractionProgressInOrganizationItemBinding;", "bind", "", "rankStatus", "", "rankProgress", "", "image", "workPosition", "", "setupItem", "setupRankActual", "setupRankAvailable", "setupRankNext", "setupRankReceived", "setupRankStatus", "setupRankUnavailable", "setupRankUnavailableContactTheLeader", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class FractionsMainMenuProgressViewHolder extends RecyclerView.ViewHolder {
        public final Animation anim;

        @NotNull
        public final FractionProgressInOrganizationItemBinding binding;
        public final /* synthetic */ FractionsMainMenuProgressAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsMainMenuProgressViewHolder(@NotNull FractionsMainMenuProgressAdapter fractionsMainMenuProgressAdapter, FractionProgressInOrganizationItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsMainMenuProgressAdapter;
            this.binding = binding;
            this.anim = AnimationUtils.loadAnimation(binding.getRoot().getContext(), R.anim.button_click);
        }

        @NotNull
        public final FractionProgressInOrganizationItemBinding getBinding() {
            return this.binding;
        }

        public final void bind(int rankStatus, @NotNull List<Integer> rankProgress, int image, @NotNull String workPosition) {
            Intrinsics.checkNotNullParameter(rankProgress, "rankProgress");
            Intrinsics.checkNotNullParameter(workPosition, "workPosition");
            this.binding.textViewStaffLevel.setText(String.valueOf(getAdapterPosition() + 1));
            switch (getLayoutPosition()) {
                case 0:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 1:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 2:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 3:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 4:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 5:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 6:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 7:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 8:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
                case 9:
                    setupItem(this.binding, image, workPosition, rankStatus, rankProgress);
                    break;
            }
            AppCompatButton appCompatButton = this.binding.imageButtonGetNewRank;
            final FractionsMainMenuProgressAdapter fractionsMainMenuProgressAdapter = this.this$0;
            appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsMainMenuProgressAdapter$FractionsMainMenuProgressViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsMainMenuProgressAdapter.FractionsMainMenuProgressViewHolder.bind$lambda$0(this.f$0, fractionsMainMenuProgressAdapter, view);
                }
            });
        }

        public static final void bind$lambda$0(FractionsMainMenuProgressViewHolder this$0, FractionsMainMenuProgressAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            view.startAnimation(this$0.anim);
            this$1.getOnGetNewRankButtonClickListener().invoke();
        }

        public final void setupItem(FractionProgressInOrganizationItemBinding binding, int image, String workPosition, int rankStatus, List<Integer> rankProgress) {
            ImageView imageViewStaff = binding.imageViewStaff;
            Intrinsics.checkNotNullExpressionValue(imageViewStaff, "imageViewStaff");
            ViewExtensionKt.loadImage$default(imageViewStaff, Integer.valueOf(image), 0, null, 6, null);
            binding.textViewStaffName.setText(workPosition);
            setupRankStatus(binding, rankStatus, rankProgress);
        }

        public final void setupRankUnavailable(FractionProgressInOrganizationItemBinding binding) {
            binding.viewRankStatusReceived.setVisibility(0);
            binding.viewRankStatusReceive.setVisibility(4);
            binding.imageButtonGetNewRank.setVisibility(4);
            binding.progressBarStaffExperience.setProgress(0);
            binding.textViewRankUnavailableContactLeader.setVisibility(4);
            TextView textView = binding.textViewRankStatus;
            textView.setText(R.string.fractions_staff_rank_unavailable);
            textView.setVisibility(0);
            binding.iconFractionsProgressExperience.setVisibility(4);
            binding.tvFractionsExperienceFromTo.setVisibility(4);
        }

        public final void setupRankActual(FractionProgressInOrganizationItemBinding binding, List<Integer> rankProgress) {
            binding.viewRankStatusReceived.setVisibility(4);
            binding.viewRankStatusReceive.setVisibility(4);
            binding.imageButtonGetNewRank.setVisibility(4);
            binding.textViewRankUnavailableContactLeader.setVisibility(4);
            binding.textViewRankStatus.setVisibility(4);
            if (rankProgress.get(1).intValue() > 0) {
                binding.tvFractionsExperienceFromTo.setVisibility(0);
                binding.iconFractionsProgressExperience.setVisibility(0);
                binding.progressBarStaffExperience.setProgress((int) ((rankProgress.get(0).intValue() / rankProgress.get(1).intValue()) * 100.0d));
                binding.tvFractionsExperienceFromTo.setText(binding.getRoot().getContext().getString(R.string.common_number_current_number_max, rankProgress.get(0), rankProgress.get(1)));
                return;
            }
            binding.iconFractionsProgressExperience.setVisibility(4);
            binding.tvFractionsExperienceFromTo.setVisibility(4);
            binding.progressBarStaffExperience.setProgress(100);
        }

        public final void setupRankNext(FractionProgressInOrganizationItemBinding binding) {
            binding.viewRankStatusReceived.setVisibility(0);
            binding.viewRankStatusReceive.setVisibility(4);
            binding.imageButtonGetNewRank.setVisibility(4);
            binding.progressBarStaffExperience.setProgress(0);
            binding.textViewRankUnavailableContactLeader.setVisibility(4);
            TextView textView = binding.textViewRankStatus;
            textView.setText(R.string.fractions_staff_rank_next);
            textView.setVisibility(0);
            binding.iconFractionsProgressExperience.setVisibility(4);
            binding.tvFractionsExperienceFromTo.setVisibility(4);
        }

        public final void setupRankAvailable(FractionProgressInOrganizationItemBinding binding) {
            binding.viewRankStatusReceived.setVisibility(0);
            binding.viewRankStatusReceive.setVisibility(0);
            binding.imageButtonGetNewRank.setVisibility(0);
            binding.progressBarStaffExperience.setProgress(0);
            binding.textViewRankUnavailableContactLeader.setVisibility(4);
            TextView textView = binding.textViewRankStatus;
            textView.setText(R.string.fractions_staff_rank_next);
            textView.setVisibility(0);
            binding.iconFractionsProgressExperience.setVisibility(4);
            binding.tvFractionsExperienceFromTo.setVisibility(4);
        }

        public final void setupRankReceived(FractionProgressInOrganizationItemBinding binding) {
            binding.viewRankStatusReceived.setVisibility(0);
            binding.viewRankStatusReceive.setVisibility(4);
            binding.imageButtonGetNewRank.setVisibility(4);
            binding.progressBarStaffExperience.setProgress(100);
            binding.textViewRankUnavailableContactLeader.setVisibility(4);
            TextView textView = binding.textViewRankStatus;
            textView.setText(R.string.common_received);
            textView.setVisibility(0);
            binding.iconFractionsProgressExperience.setVisibility(4);
            binding.tvFractionsExperienceFromTo.setVisibility(4);
        }

        public final void setupRankUnavailableContactTheLeader(FractionProgressInOrganizationItemBinding binding) {
            binding.viewRankStatusReceived.setVisibility(0);
            binding.viewRankStatusReceive.setVisibility(4);
            binding.imageButtonGetNewRank.setVisibility(4);
            binding.progressBarStaffExperience.setProgress(0);
            binding.textViewRankUnavailableContactLeader.setVisibility(0);
            TextView textView = binding.textViewRankStatus;
            textView.setText(R.string.fractions_staff_rank_unavailable);
            textView.setVisibility(0);
            binding.iconFractionsProgressExperience.setVisibility(4);
            binding.tvFractionsExperienceFromTo.setVisibility(4);
        }

        public final void setupRankStatus(FractionProgressInOrganizationItemBinding binding, int rankStatus, List<Integer> rankProgress) {
            if (rankStatus == 0) {
                setupRankUnavailable(binding);
                return;
            }
            if (rankStatus == 1) {
                setupRankActual(binding, rankProgress);
                return;
            }
            if (rankStatus == 2) {
                setupRankNext(binding);
                return;
            }
            if (rankStatus == 3) {
                setupRankAvailable(binding);
            } else if (rankStatus == 4) {
                setupRankReceived(binding);
            } else {
                if (rankStatus != 5) {
                    return;
                }
                setupRankUnavailableContactTheLeader(binding);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsMainMenuProgressViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionProgressInOrganizationItemBinding fractionProgressInOrganizationItemBindingInflate = FractionProgressInOrganizationItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fractionProgressInOrganizationItemBindingInflate, "inflate(...)");
        return new FractionsMainMenuProgressViewHolder(this, fractionProgressInOrganizationItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsMainMenuProgressViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if ((!this.listOfRanks.isEmpty()) && (!this.listOfImages.isEmpty()) && (!this.listOfPositions.isEmpty()) && (!this.rankProgress.isEmpty())) {
            holder.bind(this.listOfRanks.get(position).intValue(), this.rankProgress, this.listOfImages.get(position).intValue(), this.listOfPositions.get(position));
            return;
        }
        Toast.makeText(holder.getBinding().getRoot().getContext(), "Error: List in Adapter is empty", 1).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listOfRanks.size();
    }
}

