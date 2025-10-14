package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

/* loaded from: classes3.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public TransitionFactory<? super TranscodeType> transitionFactory = NoTransition.getFactory();

    public final CHILD self() {
        return this;
    }

    @NonNull
    public final CHILD dontTransition() {
        return (CHILD) transition(NoTransition.getFactory());
    }

    @NonNull
    public final CHILD transition(int i) {
        return (CHILD) transition(new ViewAnimationFactory(i));
    }

    @NonNull
    public final CHILD transition(@NonNull ViewPropertyTransition.Animator animator) {
        return (CHILD) transition(new ViewPropertyAnimationFactory(animator));
    }

    @NonNull
    public final CHILD transition(@NonNull TransitionFactory<? super TranscodeType> transitionFactory) {
        this.transitionFactory = (TransitionFactory) Preconditions.checkNotNull(transitionFactory);
        return (CHILD) self();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final CHILD m15138clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final TransitionFactory<? super TranscodeType> getTransitionFactory() {
        return this.transitionFactory;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionOptions) {
            return Util.bothNullOrEqual(this.transitionFactory, ((TransitionOptions) obj).transitionFactory);
        }
        return false;
    }

    public int hashCode() {
        TransitionFactory<? super TranscodeType> transitionFactory = this.transitionFactory;
        if (transitionFactory != null) {
            return transitionFactory.hashCode();
        }
        return 0;
    }
}
