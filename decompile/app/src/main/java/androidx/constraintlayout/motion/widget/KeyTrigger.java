package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.C2167R;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    public static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    public RectF mCollisionRect;
    public boolean mFireCrossReset;
    public float mFireLastPos;
    public boolean mFireNegativeReset;
    public boolean mFirePositiveReset;
    public float mFireThreshold;
    public HashMap<String, Method> mMethodHashMap;
    public String mNegativeCross;
    public String mPositiveCross;
    public boolean mPostLayout;
    public RectF mTargetRect;
    public int mTriggerCollisionId;
    public View mTriggerCollisionView;
    public int mTriggerID;
    public int mTriggerReceiver;
    public float mTriggerSlack;
    public int mViewTransitionOnCross;
    public int mViewTransitionOnNegativeCross;
    public int mViewTransitionOnPositiveCross;
    public int mCurveFit = -1;
    public String mCross = null;

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> attributes) {
    }

    public KeyTrigger() {
        int i = Key.UNSET;
        this.mTriggerReceiver = i;
        this.mNegativeCross = null;
        this.mPositiveCross = null;
        this.mTriggerID = i;
        this.mTriggerCollisionId = i;
        this.mTriggerCollisionView = null;
        this.mTriggerSlack = 0.1f;
        this.mFireCrossReset = true;
        this.mFireNegativeReset = true;
        this.mFirePositiveReset = true;
        this.mFireThreshold = Float.NaN;
        this.mPostLayout = false;
        this.mViewTransitionOnNegativeCross = i;
        this.mViewTransitionOnPositiveCross = i;
        this.mViewTransitionOnCross = i;
        this.mCollisionRect = new RectF();
        this.mTargetRect = new RectF();
        this.mMethodHashMap = new HashMap<>();
        this.mType = 5;
        this.mCustomConstraints = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attrs) {
        Loader.read(this, context.obtainStyledAttributes(attrs, C2167R.styleable.KeyTrigger), context);
    }

    public int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "positiveCross":
                this.mPositiveCross = value.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.mViewTransitionOnPositiveCross = toInt(value);
                break;
            case "triggerCollisionId":
                this.mTriggerCollisionId = toInt(value);
                break;
            case "triggerID":
                this.mTriggerID = toInt(value);
                break;
            case "negativeCross":
                this.mNegativeCross = value.toString();
                break;
            case "triggerCollisionView":
                this.mTriggerCollisionView = (View) value;
                break;
            case "viewTransitionOnNegativeCross":
                this.mViewTransitionOnNegativeCross = toInt(value);
                break;
            case "CROSS":
                this.mCross = value.toString();
                break;
            case "triggerSlack":
                this.mTriggerSlack = toFloat(value);
                break;
            case "viewTransitionOnCross":
                this.mViewTransitionOnCross = toInt(value);
                break;
            case "postLayout":
                this.mPostLayout = toBoolean(value);
                break;
            case "triggerReceiver":
                this.mTriggerReceiver = toInt(value);
                break;
        }
    }

    public final void setUpRect(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void conditionallyFire(float pos, View child) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.mTriggerCollisionId != Key.UNSET) {
            if (this.mTriggerCollisionView == null) {
                this.mTriggerCollisionView = ((ViewGroup) child.getParent()).findViewById(this.mTriggerCollisionId);
            }
            setUpRect(this.mCollisionRect, this.mTriggerCollisionView, this.mPostLayout);
            setUpRect(this.mTargetRect, child, this.mPostLayout);
            if (this.mCollisionRect.intersect(this.mTargetRect)) {
                if (this.mFireCrossReset) {
                    this.mFireCrossReset = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.mFirePositiveReset) {
                    this.mFirePositiveReset = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.mFireNegativeReset = true;
            } else {
                if (this.mFireCrossReset) {
                    z = false;
                } else {
                    this.mFireCrossReset = true;
                    z = true;
                }
                if (this.mFireNegativeReset) {
                    this.mFireNegativeReset = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.mFirePositiveReset = true;
                z6 = z4;
                z3 = false;
            }
        } else {
            if (this.mFireCrossReset) {
                float f = this.mFireThreshold;
                if ((pos - f) * (this.mFireLastPos - f) < 0.0f) {
                    this.mFireCrossReset = false;
                    z = true;
                }
                if (!this.mFireNegativeReset) {
                    float f2 = this.mFireThreshold;
                    float f3 = pos - f2;
                    if ((this.mFireLastPos - f2) * f3 < 0.0f && f3 < 0.0f) {
                        this.mFireNegativeReset = false;
                        z2 = true;
                    }
                    if (this.mFirePositiveReset) {
                        float f4 = this.mFireThreshold;
                        float f5 = pos - f4;
                        if ((this.mFireLastPos - f4) * f5 >= 0.0f || f5 <= 0.0f) {
                            z5 = false;
                        } else {
                            this.mFirePositiveReset = false;
                        }
                        z3 = z5;
                    } else {
                        if (Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                            this.mFirePositiveReset = true;
                        }
                        z3 = false;
                    }
                    z6 = z2;
                } else if (Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFireNegativeReset = true;
                }
                z2 = false;
                if (this.mFirePositiveReset) {
                }
                z6 = z2;
            } else if (Math.abs(pos - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireCrossReset = true;
            }
            z = false;
            if (!this.mFireNegativeReset) {
            }
            z2 = false;
            if (this.mFirePositiveReset) {
            }
            z6 = z2;
        }
        this.mFireLastPos = pos;
        if (z6 || z || z3) {
            ((MotionLayout) child.getParent()).fireTrigger(this.mTriggerID, z3, pos);
        }
        View viewFindViewById = this.mTriggerReceiver == Key.UNSET ? child : ((MotionLayout) child.getParent()).findViewById(this.mTriggerReceiver);
        if (z6) {
            String str = this.mNegativeCross;
            if (str != null) {
                fire(str, viewFindViewById);
            }
            if (this.mViewTransitionOnNegativeCross != Key.UNSET) {
                ((MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnNegativeCross, viewFindViewById);
            }
        }
        if (z3) {
            String str2 = this.mPositiveCross;
            if (str2 != null) {
                fire(str2, viewFindViewById);
            }
            if (this.mViewTransitionOnPositiveCross != Key.UNSET) {
                ((MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnPositiveCross, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.mCross;
            if (str3 != null) {
                fire(str3, viewFindViewById);
            }
            if (this.mViewTransitionOnCross != Key.UNSET) {
                ((MotionLayout) child.getParent()).viewTransition(this.mViewTransitionOnCross, viewFindViewById);
            }
        }
    }

    public final void fire(String str, View call) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            fireCustom(str, call);
            return;
        }
        if (this.mMethodHashMap.containsKey(str)) {
            method = this.mMethodHashMap.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, null);
                this.mMethodHashMap.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.mMethodHashMap.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + " " + Debug.getName(call));
                return;
            }
        }
        try {
            method.invoke(call, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + call.getClass().getSimpleName() + " " + Debug.getName(call));
        }
    }

    public final void fireCustom(String str, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class Loader {
        public static final int COLLISION = 9;
        public static final int CROSS = 4;
        public static final int FRAME_POS = 8;
        public static final int NEGATIVE_CROSS = 1;
        public static final int POSITIVE_CROSS = 2;
        public static final int POST_LAYOUT = 10;
        public static final int TARGET_ID = 7;
        public static final int TRIGGER_ID = 6;
        public static final int TRIGGER_RECEIVER = 11;
        public static final int TRIGGER_SLACK = 5;
        public static final int VT_CROSS = 12;
        public static final int VT_NEGATIVE_CROSS = 13;
        public static final int VT_POSITIVE_CROSS = 14;
        public static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(C2167R.styleable.KeyTrigger_framePosition, 8);
            mAttrMap.append(C2167R.styleable.KeyTrigger_onCross, 4);
            mAttrMap.append(C2167R.styleable.KeyTrigger_onNegativeCross, 1);
            mAttrMap.append(C2167R.styleable.KeyTrigger_onPositiveCross, 2);
            mAttrMap.append(C2167R.styleable.KeyTrigger_motionTarget, 7);
            mAttrMap.append(C2167R.styleable.KeyTrigger_triggerId, 6);
            mAttrMap.append(C2167R.styleable.KeyTrigger_triggerSlack, 5);
            mAttrMap.append(C2167R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            mAttrMap.append(C2167R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            mAttrMap.append(C2167R.styleable.KeyTrigger_triggerReceiver, 11);
            mAttrMap.append(C2167R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            mAttrMap.append(C2167R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            mAttrMap.append(C2167R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void read(KeyTrigger c, TypedArray a2, Context context) {
            int indexCount = a2.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a2.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        c.mNegativeCross = a2.getString(index);
                        break;
                    case 2:
                        c.mPositiveCross = a2.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        c.mCross = a2.getString(index);
                        break;
                    case 5:
                        c.mTriggerSlack = a2.getFloat(index, c.mTriggerSlack);
                        break;
                    case 6:
                        c.mTriggerID = a2.getResourceId(index, c.mTriggerID);
                        break;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = a2.getResourceId(index, c.mTargetId);
                            c.mTargetId = resourceId;
                            if (resourceId == -1) {
                                c.mTargetString = a2.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c.mTargetString = a2.getString(index);
                            break;
                        } else {
                            c.mTargetId = a2.getResourceId(index, c.mTargetId);
                            break;
                        }
                    case 8:
                        int integer = a2.getInteger(index, c.mFramePosition);
                        c.mFramePosition = integer;
                        c.mFireThreshold = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c.mTriggerCollisionId = a2.getResourceId(index, c.mTriggerCollisionId);
                        break;
                    case 10:
                        c.mPostLayout = a2.getBoolean(index, c.mPostLayout);
                        break;
                    case 11:
                        c.mTriggerReceiver = a2.getResourceId(index, c.mTriggerReceiver);
                        break;
                    case 12:
                        c.mViewTransitionOnCross = a2.getResourceId(index, c.mViewTransitionOnCross);
                        break;
                    case 13:
                        c.mViewTransitionOnNegativeCross = a2.getResourceId(index, c.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        c.mViewTransitionOnPositiveCross = a2.getResourceId(index, c.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key src) {
        super.copy(src);
        KeyTrigger keyTrigger = (KeyTrigger) src;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public Key mo14021clone() {
        return new KeyTrigger().copy(this);
    }
}
