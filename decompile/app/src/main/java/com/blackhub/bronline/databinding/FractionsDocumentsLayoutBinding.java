package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FractionsDocumentsLayoutBinding implements ViewBinding {

    @NonNull
    public final View bodyRightBlock;

    @NonNull
    public final AppCompatButton buttonAcquaintedWithDocument;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final RecyclerView recyclerViewTasksList;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewDocumentDescription;

    @NonNull
    public final TextView textViewDocumentTitle;

    @NonNull
    public final TextView textViewSectionsOfTheCharter;

    @NonNull
    public final View titleLeftBlock;

    public FractionsDocumentsLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bodyRightBlock, @NonNull AppCompatButton buttonAcquaintedWithDocument, @NonNull View leftTitleDiver, @NonNull RecyclerView recyclerViewTasksList, @NonNull TextView textViewDocumentDescription, @NonNull TextView textViewDocumentTitle, @NonNull TextView textViewSectionsOfTheCharter, @NonNull View titleLeftBlock) {
        this.rootView = rootView;
        this.bodyRightBlock = bodyRightBlock;
        this.buttonAcquaintedWithDocument = buttonAcquaintedWithDocument;
        this.leftTitleDiver = leftTitleDiver;
        this.recyclerViewTasksList = recyclerViewTasksList;
        this.textViewDocumentDescription = textViewDocumentDescription;
        this.textViewDocumentTitle = textViewDocumentTitle;
        this.textViewSectionsOfTheCharter = textViewSectionsOfTheCharter;
        this.titleLeftBlock = titleLeftBlock;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsDocumentsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsDocumentsLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fractions_documents_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FractionsDocumentsLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.body_right_block;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.body_right_block);
        if (viewFindChildViewById != null) {
            i = R.id.button_acquainted_with_document;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_acquainted_with_document);
            if (appCompatButton != null) {
                i = R.id.left_title_diver;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
                if (viewFindChildViewById2 != null) {
                    i = R.id.recycler_view_tasks_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_tasks_list);
                    if (recyclerView != null) {
                        i = R.id.text_view_document_description;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_document_description);
                        if (textView != null) {
                            i = R.id.text_view_document_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_document_title);
                            if (textView2 != null) {
                                i = R.id.text_view_sections_of_the_charter;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_sections_of_the_charter);
                                if (textView3 != null) {
                                    i = R.id.title_left_block;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.title_left_block);
                                    if (viewFindChildViewById3 != null) {
                                        return new FractionsDocumentsLayoutBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatButton, viewFindChildViewById2, recyclerView, textView, textView2, textView3, viewFindChildViewById3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
