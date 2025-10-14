package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class SpawnLocationItemBinding implements ViewBinding {

    @NonNull
    public final ImageView imageViewPlace;

    @NonNull
    public final ImageView ivLock;

    @NonNull
    public final CardView rootView;

    @NonNull
    public final TextView textViewPlaceName;

    @NonNull
    public final View viewSelection;

    @NonNull
    public final View viewSelectionUnavailable;

    public SpawnLocationItemBinding(@NonNull CardView rootView, @NonNull ImageView imageViewPlace, @NonNull ImageView ivLock, @NonNull TextView textViewPlaceName, @NonNull View viewSelection, @NonNull View viewSelectionUnavailable) {
        this.rootView = rootView;
        this.imageViewPlace = imageViewPlace;
        this.ivLock = ivLock;
        this.textViewPlaceName = textViewPlaceName;
        this.viewSelection = viewSelection;
        this.viewSelectionUnavailable = viewSelectionUnavailable;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SpawnLocationItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SpawnLocationItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.spawn_location_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static SpawnLocationItemBinding bind(@NonNull View rootView) {
        int i = R.id.image_view_place;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_view_place);
        if (imageView != null) {
            i = R.id.iv_lock;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_lock);
            if (imageView2 != null) {
                i = R.id.text_view_place_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_place_name);
                if (textView != null) {
                    i = R.id.view_selection;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_selection);
                    if (viewFindChildViewById != null) {
                        i = R.id.view_selection_unavailable;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.view_selection_unavailable);
                        if (viewFindChildViewById2 != null) {
                            return new SpawnLocationItemBinding((CardView) rootView, imageView, imageView2, textView, viewFindChildViewById, viewFindChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
