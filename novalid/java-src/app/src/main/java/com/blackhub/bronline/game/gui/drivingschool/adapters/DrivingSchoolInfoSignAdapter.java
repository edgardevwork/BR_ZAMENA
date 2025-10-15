package com.blackhub.bronline.game.gui.drivingschool.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DrivingSchoolSignInfoItemBinding;
import com.blackhub.bronline.game.gui.drivingschool.data.SignObj;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrivingSchoolInfoSignAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolInfoSignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolInfoSignAdapter$ViewHolder;", "signList", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/SignObj;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrivingSchoolInfoSignAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context context;

    @NotNull
    public final List<SignObj> signList;

    public DrivingSchoolInfoSignAdapter(@NotNull List<SignObj> signList, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(signList, "signList");
        Intrinsics.checkNotNullParameter(context, "context");
        this.signList = signList;
        this.context = context;
    }

    /* compiled from: DrivingSchoolInfoSignAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolInfoSignAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DrivingSchoolSignInfoItemBinding;", "(Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolInfoSignAdapter;Lcom/blackhub/bronline/databinding/DrivingSchoolSignInfoItemBinding;)V", "bind", "", "signItem", "Lcom/blackhub/bronline/game/gui/drivingschool/data/SignObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DrivingSchoolSignInfoItemBinding binding;
        public final /* synthetic */ DrivingSchoolInfoSignAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DrivingSchoolInfoSignAdapter drivingSchoolInfoSignAdapter, DrivingSchoolSignInfoItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = drivingSchoolInfoSignAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull SignObj signItem) {
            Intrinsics.checkNotNullParameter(signItem, "signItem");
            DrivingSchoolSignInfoItemBinding drivingSchoolSignInfoItemBinding = this.binding;
            DrivingSchoolInfoSignAdapter drivingSchoolInfoSignAdapter = this.this$0;
            try {
                String string = drivingSchoolInfoSignAdapter.context.getString(R.string.driving_school_sign_title);
                SpannableString spannableString = new SpannableString(drivingSchoolInfoSignAdapter.context.getString(signItem.getLeftSignName()));
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(drivingSchoolInfoSignAdapter.context, R.color.light_green)), 0, spannableString.length(), 33);
                Unit unit = Unit.INSTANCE;
                CharSequence charSequenceConcat = TextUtils.concat(string, spannableString);
                drivingSchoolSignInfoItemBinding.iconSingLeft.setImageResource(signItem.getLeftSignIcon());
                drivingSchoolSignInfoItemBinding.titleSignLeft.setText(charSequenceConcat);
                drivingSchoolSignInfoItemBinding.textSignLeft.setText(drivingSchoolInfoSignAdapter.context.getString(signItem.getLeftSignDescription()));
                if (signItem.getRightSignIcon() != null && signItem.getRightSignName() != null && signItem.getRightSignDescription() != null) {
                    String string2 = drivingSchoolInfoSignAdapter.context.getString(R.string.driving_school_sign_title);
                    SpannableString spannableString2 = new SpannableString(drivingSchoolInfoSignAdapter.context.getString(signItem.getRightSignName().intValue()));
                    spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(drivingSchoolInfoSignAdapter.context, R.color.light_green)), 0, spannableString2.length(), 33);
                    CharSequence charSequenceConcat2 = TextUtils.concat(string2, spannableString2);
                    drivingSchoolSignInfoItemBinding.iconSingRight.setImageResource(signItem.getRightSignIcon().intValue());
                    drivingSchoolSignInfoItemBinding.titleSignRight.setText(charSequenceConcat2);
                    drivingSchoolSignInfoItemBinding.textSignRight.setText(drivingSchoolInfoSignAdapter.context.getString(signItem.getRightSignDescription().intValue()));
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (signItem.getIfShowUnderline()) {
                drivingSchoolSignInfoItemBinding.dividerHorizontalUnderline.setVisibility(0);
            } else {
                drivingSchoolSignInfoItemBinding.dividerHorizontalUnderline.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DrivingSchoolSignInfoItemBinding drivingSchoolSignInfoItemBindingInflate = DrivingSchoolSignInfoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(drivingSchoolSignInfoItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, drivingSchoolSignInfoItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.signList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.signList.size();
    }
}
