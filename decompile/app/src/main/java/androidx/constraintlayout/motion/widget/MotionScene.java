package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2167R;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class MotionScene {
    public static final int ANTICIPATE = 6;
    public static final int BOUNCE = 4;
    public static final String CONSTRAINTSET_TAG = "ConstraintSet";
    public static final boolean DEBUG = false;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    public static final String INCLUDE_TAG = "include";
    public static final String INCLUDE_TAG_UC = "Include";
    public static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int LINEAR = 3;
    public static final int MIN_DURATION = 8;
    public static final String MOTIONSCENE_TAG = "MotionScene";
    public static final String ONCLICK_TAG = "OnClick";
    public static final String ONSWIPE_TAG = "OnSwipe";
    public static final int OVERSHOOT = 5;
    public static final int SPLINE_STRING = -1;
    public static final String STATESET_TAG = "StateSet";
    public static final String TAG = "MotionScene";
    public static final int TRANSITION_BACKWARD = 0;
    public static final int TRANSITION_FORWARD = 1;
    public static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    public static final String VIEW_TRANSITION = "ViewTransition";
    public MotionEvent mLastTouchDown;
    public float mLastTouchX;
    public float mLastTouchY;
    public final MotionLayout mMotionLayout;
    public boolean mRtl;
    public MotionLayout.MotionTracker mVelocityTracker;
    public final ViewTransitionController mViewTransitionController;
    public StateSet mStateSet = null;
    public Transition mCurrentTransition = null;
    public boolean mDisableAutoTransition = false;
    public ArrayList<Transition> mTransitionList = new ArrayList<>();
    public Transition mDefaultTransition = null;
    public ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    public SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    public HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    public SparseIntArray mDeriveMap = new SparseIntArray();
    public boolean DEBUG_DESKTOP = false;
    public int mDefaultDuration = 400;
    public int mLayoutDuringTransition = 0;
    public boolean mIgnoreTouch = false;
    public boolean mMotionOutsideRegion = false;

    public float getPathPercent(View view, int position) {
        return 0.0f;
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTransition(int beginId, int endId) {
        int iStateGetConstraintID;
        int iStateGetConstraintID2;
        Transition transition;
        Iterator<Transition> it;
        Iterator<Transition> it2;
        StateSet stateSet = this.mStateSet;
        if (stateSet != null) {
            iStateGetConstraintID = stateSet.stateGetConstraintID(beginId, -1, -1);
            if (iStateGetConstraintID == -1) {
                iStateGetConstraintID = beginId;
            }
            iStateGetConstraintID2 = this.mStateSet.stateGetConstraintID(endId, -1, -1);
            if (iStateGetConstraintID2 == -1) {
            }
            transition = this.mCurrentTransition;
            if (transition == null && transition.mConstraintSetEnd == endId && this.mCurrentTransition.mConstraintSetStart == beginId) {
                return;
            }
            it = this.mTransitionList.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if ((next.mConstraintSetEnd == iStateGetConstraintID2 && next.mConstraintSetStart == iStateGetConstraintID) || (next.mConstraintSetEnd == endId && next.mConstraintSetStart == beginId)) {
                    this.mCurrentTransition = next;
                    if (next == null || next.mTouchResponse == null) {
                        return;
                    }
                    this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
                    return;
                }
            }
            Transition transition2 = this.mDefaultTransition;
            it2 = this.mAbstractTransitionList.iterator();
            while (it2.hasNext()) {
                Transition next2 = it2.next();
                if (next2.mConstraintSetEnd == endId) {
                    transition2 = next2;
                }
            }
            Transition transition3 = new Transition(this, transition2);
            transition3.mConstraintSetStart = iStateGetConstraintID;
            transition3.mConstraintSetEnd = iStateGetConstraintID2;
            if (iStateGetConstraintID != -1) {
                this.mTransitionList.add(transition3);
            }
            this.mCurrentTransition = transition3;
        }
        iStateGetConstraintID = beginId;
        iStateGetConstraintID2 = endId;
        transition = this.mCurrentTransition;
        if (transition == null) {
        }
        it = this.mTransitionList.iterator();
        while (it.hasNext()) {
        }
        Transition transition22 = this.mDefaultTransition;
        it2 = this.mAbstractTransitionList.iterator();
        while (it2.hasNext()) {
        }
        Transition transition32 = new Transition(this, transition22);
        transition32.mConstraintSetStart = iStateGetConstraintID;
        transition32.mConstraintSetEnd = iStateGetConstraintID2;
        if (iStateGetConstraintID != -1) {
        }
        this.mCurrentTransition = transition32;
    }

    public void addTransition(Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public void removeTransition(Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    public final int getIndex(Transition transition) {
        int i = transition.mId;
        if (i == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i2 = 0; i2 < this.mTransitionList.size(); i2++) {
            if (this.mTransitionList.get(i2).mId == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean validateLayout(MotionLayout layout) {
        return layout == this.mMotionLayout && layout.mScene == this;
    }

    public void setTransition(Transition transition) {
        this.mCurrentTransition = transition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    public final int getRealID(int stateId) {
        int iStateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        return (stateSet == null || (iStateGetConstraintID = stateSet.stateGetConstraintID(stateId, -1, -1)) == -1) ? stateId : iStateGetConstraintID;
    }

    public List<Transition> getTransitionsWithState(int stateId) {
        int realID = getRealID(stateId);
        ArrayList arrayList = new ArrayList();
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mConstraintSetStart == realID || next.mConstraintSetEnd == realID) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void addOnClickListeners(MotionLayout motionLayout, int currentState) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mOnClicks.size() > 0) {
                Iterator it2 = next.mOnClicks.iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it3 = this.mAbstractTransitionList.iterator();
        while (it3.hasNext()) {
            Transition next2 = it3.next();
            if (next2.mOnClicks.size() > 0) {
                Iterator it4 = next2.mOnClicks.iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it5 = this.mTransitionList.iterator();
        while (it5.hasNext()) {
            Transition next3 = it5.next();
            if (next3.mOnClicks.size() > 0) {
                Iterator it6 = next3.mOnClicks.iterator();
                while (it6.hasNext()) {
                    ((Transition.TransitionOnClick) it6.next()).addOnClickListeners(motionLayout, currentState, next3);
                }
            }
        }
        Iterator<Transition> it7 = this.mAbstractTransitionList.iterator();
        while (it7.hasNext()) {
            Transition next4 = it7.next();
            if (next4.mOnClicks.size() > 0) {
                Iterator it8 = next4.mOnClicks.iterator();
                while (it8.hasNext()) {
                    ((Transition.TransitionOnClick) it8.next()).addOnClickListeners(motionLayout, currentState, next4);
                }
            }
        }
    }

    public Transition bestTransitionFor(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        if (currentState != -1) {
            List<Transition> transitionsWithState = getTransitionsWithState(currentState);
            RectF rectF = new RectF();
            float f = 0.0f;
            Transition transition = null;
            for (Transition transition2 : transitionsWithState) {
                if (!transition2.mDisable && transition2.mTouchResponse != null) {
                    transition2.mTouchResponse.setRTL(this.mRtl);
                    RectF touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion == null || lastTouchDown == null || touchRegion.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        RectF limitBoundsTo = transition2.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                        if (limitBoundsTo == null || lastTouchDown == null || limitBoundsTo.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                            float fDot = transition2.mTouchResponse.dot(dx, dy);
                            if (transition2.mTouchResponse.mIsRotateMode && lastTouchDown != null) {
                                fDot = ((float) (Math.atan2(dy + r10, dx + r9) - Math.atan2(lastTouchDown.getX() - transition2.mTouchResponse.mRotateCenterX, lastTouchDown.getY() - transition2.mTouchResponse.mRotateCenterY))) * 10.0f;
                            }
                            float f2 = fDot * (transition2.mConstraintSetEnd == currentState ? -1.0f : 1.1f);
                            if (f2 > f) {
                                transition = transition2;
                                f = f2;
                            }
                        }
                    }
                }
            }
            return transition;
        }
        return this.mCurrentTransition;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public Transition getTransitionById(int id) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mId == id) {
                return next;
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.mConstraintSetMap.keyAt(i);
        }
        return iArr;
    }

    public boolean autoTransition(MotionLayout motionLayout, int currentState) {
        Transition transition;
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mAutoTransition != 0 && ((transition = this.mCurrentTransition) != next || !transition.isTransitionFlag(2))) {
                if (currentState == next.mConstraintSetStart && (next.mAutoTransition == 4 || next.mAutoTransition == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
                if (currentState == next.mConstraintSetEnd && (next.mAutoTransition == 3 || next.mAutoTransition == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    public void setRtl(boolean rtl) {
        this.mRtl = rtl;
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    public void viewTransition(int id, View... view) {
        this.mViewTransitionController.viewTransition(id, view);
    }

    public void enableViewTransition(int id, boolean enable) {
        this.mViewTransitionController.enableViewTransition(id, enable);
    }

    public boolean isViewTransitionEnabled(int id) {
        return this.mViewTransitionController.isViewTransitionEnabled(id);
    }

    public boolean applyViewTransition(int viewTransitionId, MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(viewTransitionId, motionController);
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        public static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        public static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        public static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        public int mAutoTransition;
        public int mConstraintSetEnd;
        public int mConstraintSetStart;
        public int mDefaultInterpolator;
        public int mDefaultInterpolatorID;
        public String mDefaultInterpolatorString;
        public boolean mDisable;
        public int mDuration;
        public int mId;
        public boolean mIsAbstract;
        public ArrayList<KeyFrames> mKeyFramesList;
        public int mLayoutDuringTransition;
        public final MotionScene mMotionScene;
        public ArrayList<TransitionOnClick> mOnClicks;
        public int mPathMotionArc;
        public float mStagger;
        public TouchResponse mTouchResponse;
        public int mTransitionFlags;

        public void setOnSwipe(OnSwipe onSwipe) {
            this.mTouchResponse = onSwipe == null ? null : new TouchResponse(this.mMotionScene.mMotionLayout, onSwipe);
        }

        public void addOnClick(int id, int action) {
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (it.hasNext()) {
                TransitionOnClick next = it.next();
                if (next.mTargetId == id) {
                    next.mMode = action;
                    return;
                }
            }
            this.mOnClicks.add(new TransitionOnClick(this, id, action));
        }

        public void removeOnClick(int id) {
            TransitionOnClick next;
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.mTargetId == id) {
                        break;
                    }
                }
            }
            if (next != null) {
                this.mOnClicks.remove(next);
            }
        }

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public void setLayoutDuringTransition(int mode) {
            this.mLayoutDuringTransition = mode;
        }

        public void addOnClick(Context context, XmlPullParser parser) {
            this.mOnClicks.add(new TransitionOnClick(context, this, parser));
        }

        public void setAutoTransition(int type) {
            this.mAutoTransition = type;
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getId() {
            return this.mId;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public void setDuration(int duration) {
            this.mDuration = Math.max(duration, 8);
        }

        public int getDuration() {
            return this.mDuration;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public void setStagger(float stagger) {
            this.mStagger = stagger;
        }

        public void setPathMotionArc(int arcMode) {
            this.mPathMotionArc = arcMode;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public void setEnable(boolean enable) {
            setEnabled(enable);
        }

        public void setEnabled(boolean enable) {
            this.mDisable = !enable;
        }

        public String debugString(Context context) throws Resources.NotFoundException {
            String resourceEntryName;
            if (this.mConstraintSetStart == -1) {
                resourceEntryName = "null";
            } else {
                resourceEntryName = context.getResources().getResourceEntryName(this.mConstraintSetStart);
            }
            if (this.mConstraintSetEnd == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        public boolean isTransitionFlag(int flag) {
            return (flag & this.mTransitionFlags) != 0;
        }

        public void setTransitionFlag(int flag) {
            this.mTransitionFlags = flag;
        }

        public void setOnTouchUp(int touchUpMode) {
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(touchUpMode);
            }
        }

        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            public int mMode;
            public int mTargetId;
            public final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser parser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C2167R.styleable.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == C2167R.styleable.OnClick_targetId) {
                        this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == C2167R.styleable.OnClick_clickAction) {
                        this.mMode = typedArrayObtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public TransitionOnClick(Transition transition, int id, int action) {
                this.mTransition = transition;
                this.mTargetId = id;
                this.mMode = action;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void addOnClickListeners(MotionLayout motionLayout, int i, Transition transition) {
                int i2 = this.mTargetId;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i2 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i2);
                }
                if (motionLayoutFindViewById != null) {
                    int i3 = transition.mConstraintSetStart;
                    int i4 = transition.mConstraintSetEnd;
                    if (i3 == -1) {
                        motionLayoutFindViewById.setOnClickListener(this);
                        return;
                    }
                    int i5 = this.mMode;
                    boolean z = false;
                    boolean z2 = ((i5 & 1) != 0 && i == i3) | ((i5 & 1) != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                    if ((i5 & 4096) != 0 && i == i4) {
                        z = true;
                    }
                    if (z2 || z) {
                        motionLayoutFindViewById.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                Log.e("MotionScene", "OnClick could not find id " + this.mTargetId);
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i = this.mTargetId;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById == null) {
                    Log.e("MotionScene", " (*)  could not find id " + this.mTargetId);
                    return;
                }
                viewFindViewById.setOnClickListener(null);
            }

            public boolean isTransitionViable(Transition current, MotionLayout tl) {
                Transition transition = this.mTransition;
                if (transition == current) {
                    return true;
                }
                int i = transition.mConstraintSetEnd;
                int i2 = this.mTransition.mConstraintSetStart;
                if (i2 == -1) {
                    return tl.mCurrentState != i;
                }
                int i3 = tl.mCurrentState;
                return i3 == i2 || i3 == i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                if (motionLayout.isInteractionEnabled()) {
                    if (this.mTransition.mConstraintSetStart != -1) {
                        Transition transition = this.mTransition.mMotionScene.mCurrentTransition;
                        int i = this.mMode;
                        boolean z = false;
                        boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                        boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                        if (z2 && z3) {
                            Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                            Transition transition3 = this.mTransition;
                            if (transition2 != transition3) {
                                motionLayout.setTransition(transition3);
                            }
                            if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                                z3 = false;
                                z = z2;
                            }
                        } else {
                            z = z2;
                        }
                        if (isTransitionViable(transition, motionLayout)) {
                            if (z && (this.mMode & 1) != 0) {
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.transitionToEnd();
                                return;
                            }
                            if (z3 && (this.mMode & 16) != 0) {
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.transitionToStart();
                                return;
                            } else if (z && (this.mMode & 256) != 0) {
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.setProgress(1.0f);
                                return;
                            } else {
                                if (!z3 || (this.mMode & 4096) == 0) {
                                    return;
                                }
                                motionLayout.setTransition(this.mTransition);
                                motionLayout.setProgress(0.0f);
                                return;
                            }
                        }
                        return;
                    }
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.transitionToState(this.mTransition.mConstraintSetEnd);
                        return;
                    }
                    Transition transition4 = new Transition(this.mTransition.mMotionScene, this.mTransition);
                    transition4.mConstraintSetStart = currentState;
                    transition4.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                    motionLayout.setTransition(transition4);
                    motionLayout.transitionToEnd();
                }
            }
        }

        public Transition(MotionScene motionScene, Transition global) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (global != null) {
                this.mPathMotionArc = global.mPathMotionArc;
                this.mDefaultInterpolator = global.mDefaultInterpolator;
                this.mDefaultInterpolatorString = global.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = global.mDefaultInterpolatorID;
                this.mDuration = global.mDuration;
                this.mKeyFramesList = global.mKeyFramesList;
                this.mStagger = global.mStagger;
                this.mLayoutDuringTransition = global.mLayoutDuringTransition;
            }
        }

        public Transition(int id, MotionScene motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = id;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = constraintSetStartId;
            this.mConstraintSetEnd = constraintSetEndId;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        public Transition(MotionScene motionScene, Context context, XmlPullParser parser) throws Resources.NotFoundException {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(parser));
        }

        public void setInterpolatorInfo(int interpolator, String interpolatorString, int interpolatorID) {
            this.mDefaultInterpolator = interpolator;
            this.mDefaultInterpolatorString = interpolatorString;
            this.mDefaultInterpolatorID = interpolatorID;
        }

        public final void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attrs) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2167R.styleable.Transition);
            fill(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public final void fill(MotionScene motionScene, Context context, TypedArray a2) throws Resources.NotFoundException {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                if (index == C2167R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = a2.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == C2167R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = a2.getResourceId(index, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == C2167R.styleable.Transition_motionInterpolator) {
                    int i2 = a2.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = a2.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (i2 == 3) {
                        String string = a2.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.mDefaultInterpolatorID = a2.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = a2.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == C2167R.styleable.Transition_duration) {
                    int i3 = a2.getInt(index, this.mDuration);
                    this.mDuration = i3;
                    if (i3 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == C2167R.styleable.Transition_staggered) {
                    this.mStagger = a2.getFloat(index, this.mStagger);
                } else if (index == C2167R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = a2.getInteger(index, this.mAutoTransition);
                } else if (index == C2167R.styleable.Transition_android_id) {
                    this.mId = a2.getResourceId(index, this.mId);
                } else if (index == C2167R.styleable.Transition_transitionDisable) {
                    this.mDisable = a2.getBoolean(index, this.mDisable);
                } else if (index == C2167R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = a2.getInteger(index, -1);
                } else if (index == C2167R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = a2.getInteger(index, 0);
                } else if (index == C2167R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = a2.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }
    }

    public MotionScene(MotionLayout layout) {
        this.mMotionLayout = layout;
        this.mViewTransitionController = new ViewTransitionController(layout);
    }

    public MotionScene(Context context, MotionLayout layout, int resourceID) throws Resources.NotFoundException {
        this.mMotionLayout = layout;
        this.mViewTransitionController = new ViewTransitionController(layout);
        load(context, resourceID);
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        int i = C2167R.id.motion_base;
        sparseArray.put(i, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void load(Context context, int resourceId) throws Resources.NotFoundException {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            Transition transition = null;
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.DEBUG_DESKTOP) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                c = 65535;
                                break;
                            } else {
                                c = 5;
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -687739768:
                            if (name.equals(INCLUDE_TAG_UC)) {
                                c = 7;
                                break;
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 269306229:
                            if (name.equals(TRANSITION_TAG)) {
                                break;
                            }
                            break;
                        case 312750793:
                            if (name.equals(ONCLICK_TAG)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals(ONSWIPE_TAG)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals(STATESET_TAG)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1942574248:
                            if (name.equals(INCLUDE_TAG)) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            parseMotionSceneTags(context, xml);
                            break;
                        case 1:
                            ArrayList<Transition> arrayList = this.mTransitionList;
                            transition = new Transition(this, context, xml);
                            arrayList.add(transition);
                            if (this.mCurrentTransition == null && !transition.mIsAbstract) {
                                this.mCurrentTransition = transition;
                                if (transition.mTouchResponse != null) {
                                    this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
                                }
                            }
                            if (!transition.mIsAbstract) {
                                break;
                            } else {
                                if (transition.mConstraintSetEnd == -1) {
                                    this.mDefaultTransition = transition;
                                } else {
                                    this.mAbstractTransitionList.add(transition);
                                }
                                this.mTransitionList.remove(transition);
                                break;
                            }
                            break;
                        case 2:
                            if (transition == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(resourceId) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (transition == null) {
                                break;
                            } else {
                                transition.mTouchResponse = new TouchResponse(context, this.mMotionLayout, xml);
                                break;
                            }
                        case 3:
                            if (transition == null) {
                                break;
                            } else {
                                transition.addOnClick(context, xml);
                                break;
                            }
                        case 4:
                            this.mStateSet = new StateSet(context, xml);
                            break;
                        case 5:
                            parseConstraintSet(context, xml);
                            break;
                        case 6:
                        case 7:
                            parseInclude(context, xml);
                            break;
                        case '\b':
                            KeyFrames keyFrames = new KeyFrames(context, xml);
                            if (transition == null) {
                                break;
                            } else {
                                transition.mKeyFramesList.add(keyFrames);
                                break;
                            }
                        case '\t':
                            this.mViewTransitionController.add(new ViewTransition(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void parseMotionSceneTags(Context context, XmlPullParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C2167R.styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C2167R.styleable.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i2;
                if (i2 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == C2167R.styleable.MotionScene_layoutDuringTransition) {
                this.mLayoutDuringTransition = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int getId(Context context, String idString) {
        int identifier;
        if (idString.contains("/")) {
            identifier = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.DEBUG_DESKTOP) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (idString.length() > 1) {
            return Integer.parseInt(idString.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    public final void parseInclude(Context context, XmlPullParser mainParser) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(mainParser), C2167R.styleable.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C2167R.styleable.include_constraintSet) {
                parseInclude(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int parseInclude(Context context, int resourceId) throws Resources.NotFoundException {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int parseConstraintSet(Context context, XmlPullParser parser) {
        String attributeValue;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = parser.getAttributeCount();
        int id = -1;
        int id2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = parser.getAttributeName(i);
            attributeValue = parser.getAttributeValue(i);
            if (this.DEBUG_DESKTOP) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    id2 = getId(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                constraintSet.mRotate = 4;
                                break;
                            case "left":
                                constraintSet.mRotate = 2;
                                break;
                            case "none":
                                constraintSet.mRotate = 0;
                                break;
                            case "right":
                                constraintSet.mRotate = 1;
                                break;
                            case "x_right":
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    id = getId(context, attributeValue);
                    this.mConstraintSetIdMap.put(stripID(attributeValue), Integer.valueOf(id));
                    constraintSet.mIdString = Debug.getName(context, id);
                    break;
            }
        }
        if (id != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, parser);
            if (id2 != -1) {
                this.mDeriveMap.put(id, id2);
            }
            this.mConstraintSetMap.put(id, constraintSet);
        }
        return id;
    }

    public ConstraintSet getConstraintSet(Context context, String id) throws Resources.NotFoundException {
        if (this.DEBUG_DESKTOP) {
            PrintStream printStream = System.out;
            printStream.println("id " + id);
            printStream.println("size " + this.mConstraintSetMap.size());
        }
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.DEBUG_DESKTOP) {
                System.out.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + id + ">");
            }
            if (id.equals(resourceName)) {
                return this.mConstraintSetMap.get(iKeyAt);
            }
        }
        return null;
    }

    public ConstraintSet getConstraintSet(int id) {
        return getConstraintSet(id, -1, -1);
    }

    public ConstraintSet getConstraintSet(int id, int width, int height) {
        int iStateGetConstraintID;
        if (this.DEBUG_DESKTOP) {
            PrintStream printStream = System.out;
            printStream.println("id " + id);
            printStream.println("size " + this.mConstraintSetMap.size());
        }
        StateSet stateSet = this.mStateSet;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(id, width, height)) != -1) {
            id = iStateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(id) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), id) + " In MotionScene");
            SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.mConstraintSetMap.get(id);
    }

    public void setConstraintSet(int id, ConstraintSet set) {
        this.mConstraintSetMap.put(id, set);
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            Iterator it = transition.mKeyFramesList.iterator();
            while (it.hasNext()) {
                ((KeyFrames) it.next()).addFrames(motionController);
            }
        } else {
            Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                Iterator it2 = transition2.mKeyFramesList.iterator();
                while (it2.hasNext()) {
                    ((KeyFrames) it2.next()).addFrames(motionController);
                }
            }
        }
    }

    public Key getKeyFrame(Context context, int type, int target, int position) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            KeyFrames keyFrames = (KeyFrames) it.next();
            for (Integer num : keyFrames.getKeys()) {
                if (target == num.intValue()) {
                    Iterator<Key> it2 = keyFrames.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        Key next = it2.next();
                        if (next.mFramePosition == position && next.mType == type) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public int getTransitionDirection(int stateId) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mConstraintSetStart == stateId) {
                return 0;
            }
        }
        return 1;
    }

    public boolean hasKeyFramePosition(View view, int position) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(View view, int position, String name, Object value) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == position) {
                    if (value != null) {
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public boolean supportTouch() {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mTouchResponse != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        return (transition == null || transition.mTouchResponse == null) ? false : true;
    }

    public void processTouchEvent(MotionEvent event, int currentState, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z = false;
            if (action == 0) {
                this.mLastTouchX = event.getRawX();
                this.mLastTouchY = event.getRawY();
                this.mLastTouchDown = event;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion != null && !touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            this.mMotionOutsideRegion = true;
                        } else {
                            this.mMotionOutsideRegion = false;
                        }
                        this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                        return;
                    }
                    this.mLastTouchDown = null;
                    this.mIgnoreTouch = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.mIgnoreTouch) {
                float rawY = event.getRawY() - this.mLastTouchY;
                float rawX = event.getRawX() - this.mLastTouchX;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent = this.mLastTouchDown) == null) {
                    return;
                }
                Transition transitionBestTransitionFor = bestTransitionFor(currentState, rawX, rawY, motionEvent);
                if (transitionBestTransitionFor != null) {
                    motionLayout.setTransition(transitionBestTransitionFor);
                    RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        z = true;
                    }
                    this.mMotionOutsideRegion = z;
                    this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                }
            }
        }
        if (this.mIgnoreTouch) {
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(event, this.mVelocityTracker, currentState, this);
        }
        this.mLastTouchX = event.getRawX();
        this.mLastTouchY = event.getRawY();
        if (event.getAction() != 1 || (motionTracker = this.mVelocityTracker) == null) {
            return;
        }
        motionTracker.recycle();
        this.mVelocityTracker = null;
        int i = motionLayout.mCurrentState;
        if (i != -1) {
            autoTransition(motionLayout, i);
        }
    }

    public void processScrollMove(float dx, float dy) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollMove(dx, dy);
    }

    public void processScrollUp(float dx, float dy) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollUp(dx, dy);
    }

    public float getProgressDirection(float dx, float dy) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(dx, dy);
    }

    public int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    public int getEndId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public Interpolator getInterpolator() {
        int i = this.mCurrentTransition.mDefaultInterpolator;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i == -1) {
            return new Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                public final /* synthetic */ Easing val$easing;

                public InterpolatorC21521(MotionScene this, final Easing val$easing) {
                    val$easing = val$easing;
                }

                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float v) {
                    return (float) val$easing.get(v);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionScene$1 */
    public class InterpolatorC21521 implements Interpolator {
        public final /* synthetic */ Easing val$easing;

        public InterpolatorC21521(MotionScene this, final Easing val$easing) {
            val$easing = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v) {
            return (float) val$easing.get(v);
        }
    }

    public int getDuration() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mDuration;
        }
        return this.mDefaultDuration;
    }

    public void setDuration(int duration) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(duration);
        } else {
            this.mDefaultDuration = duration;
        }
    }

    public int gatPathMotionArc() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    public float getStaggered() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    public float getMaxAcceleration() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    public float getMaxVelocity() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    public float getSpringStiffiness() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStiffness();
    }

    public float getSpringMass() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringMass();
    }

    public float getSpringDamping() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringDamping();
    }

    public float getSpringStopThreshold() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStopThreshold();
    }

    public int getSpringBoundary() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringBoundary();
    }

    public int getAutoCompleteMode() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getAutoCompleteMode();
    }

    public void setupTouch() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setupTouch();
    }

    public boolean getMoveWhenScrollAtTop() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    public void readFallback(MotionLayout motionLayout) {
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i);
            if (hasCycleDependency(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            readConstraintChain(iKeyAt, motionLayout);
        }
    }

    public final boolean hasCycleDependency(int key) {
        int i = this.mDeriveMap.get(key);
        int size = this.mDeriveMap.size();
        while (i > 0) {
            if (i == key) {
                return true;
            }
            int i2 = size - 1;
            if (size < 0) {
                return true;
            }
            i = this.mDeriveMap.get(i);
            size = i2;
        }
        return false;
    }

    public final void readConstraintChain(int key, MotionLayout motionLayout) {
        ConstraintSet constraintSet = this.mConstraintSetMap.get(key);
        constraintSet.derivedState = constraintSet.mIdString;
        int i = this.mDeriveMap.get(key);
        if (i > 0) {
            readConstraintChain(i, motionLayout);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i));
                return;
            }
            constraintSet.derivedState += "/" + constraintSet2.derivedState;
            constraintSet.readFallback(constraintSet2);
        } else {
            constraintSet.derivedState += "  layout";
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static String stripID(String id) {
        if (id == null) {
            return "";
        }
        int iIndexOf = id.indexOf(47);
        return iIndexOf < 0 ? id : id.substring(iIndexOf + 1);
    }

    public int lookUpConstraintId(String id) {
        Integer num = this.mConstraintSetIdMap.get(id);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int id) {
        for (Map.Entry<String, Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void disableAutoTransition(boolean disable) {
        this.mDisableAutoTransition = disable;
    }

    public static String getLine(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + Debug.getName(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }
}
