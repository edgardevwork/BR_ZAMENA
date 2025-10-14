package androidx.transition;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

/* loaded from: classes.dex */
public class TransitionInflater {
    public final Context mContext;
    public static final Class<?>[] CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class};
    public static final ArrayMap<String, Constructor<?>> CONSTRUCTORS = new ArrayMap<>();

    public TransitionInflater(@NonNull Context context) {
        this.mContext = context;
    }

    @NonNull
    public static TransitionInflater from(@NonNull Context context) {
        return new TransitionInflater(context);
    }

    @Nullable
    public Transition inflateTransition(int i) throws Resources.NotFoundException {
        XmlResourceParser xml = this.mContext.getResources().getXml(i);
        try {
            try {
                return createTransitionFromXml(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    @Nullable
    public TransitionManager inflateTransitionManager(int i, @NonNull ViewGroup viewGroup) throws Resources.NotFoundException {
        XmlResourceParser xml = this.mContext.getResources().getXml(i);
        try {
            try {
                return createTransitionManagerFromXml(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e.getMessage());
                inflateException.initCause(e);
                throw inflateException;
            } catch (XmlPullParserException e2) {
                InflateException inflateException2 = new InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0183, code lost:
    
        return r3;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Transition createTransitionFromXml(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        TransitionSet transitionSet = transition instanceof TransitionSet ? (TransitionSet) transition : null;
        loop0: while (true) {
            Transition transitionSet2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                    break loop0;
                }
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("fade".equals(name)) {
                        transitionSet2 = new Fade(this.mContext, attributeSet);
                    } else if ("changeBounds".equals(name)) {
                        transitionSet2 = new ChangeBounds(this.mContext, attributeSet);
                    } else if ("slide".equals(name)) {
                        transitionSet2 = new Slide(this.mContext, attributeSet);
                    } else if ("explode".equals(name)) {
                        transitionSet2 = new Explode(this.mContext, attributeSet);
                    } else if ("changeImageTransform".equals(name)) {
                        transitionSet2 = new ChangeImageTransform(this.mContext, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        transitionSet2 = new ChangeTransform(this.mContext, attributeSet);
                    } else if ("changeClipBounds".equals(name)) {
                        transitionSet2 = new ChangeClipBounds(this.mContext, attributeSet);
                    } else if (TypedValues.TransitionType.S_AUTO_TRANSITION.equals(name)) {
                        transitionSet2 = new AutoTransition(this.mContext, attributeSet);
                    } else if ("changeScroll".equals(name)) {
                        transitionSet2 = new ChangeScroll(this.mContext, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        transitionSet2 = new TransitionSet(this.mContext, attributeSet);
                    } else if (AnimatedStateListDrawableCompat.ELEMENT_TRANSITION.equals(name)) {
                        transitionSet2 = (Transition) createCustom(attributeSet, Transition.class, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
                    } else if ("targets".equals(name)) {
                        getTargetIds(xmlPullParser, attributeSet, transition);
                    } else if ("arcMotion".equals(name)) {
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        transition.setPathMotion(new ArcMotion(this.mContext, attributeSet));
                    } else if ("pathMotion".equals(name)) {
                        if (transition != null) {
                            transition.setPathMotion((PathMotion) createCustom(attributeSet, PathMotion.class, "pathMotion"));
                        } else {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        }
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        transition.setPathMotion(new PatternPathMotion(this.mContext, attributeSet));
                    }
                    if (transitionSet2 == null) {
                        continue;
                    } else {
                        if (!xmlPullParser.isEmptyElementTag()) {
                            createTransitionFromXml(xmlPullParser, attributeSet, transitionSet2);
                        }
                        if (transitionSet != null) {
                            break;
                        }
                        if (transition != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            transitionSet.addTransition(transitionSet2);
        }
    }

    public final Object createCustom(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            ArrayMap<String, Constructor<?>> arrayMap = CONSTRUCTORS;
            synchronized (arrayMap) {
                try {
                    Constructor<?> constructor = arrayMap.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.mContext.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(CONSTRUCTOR_SIGNATURE);
                        constructor.setAccessible(true);
                        arrayMap.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.mContext, attributeSet);
                } finally {
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }

    public final void getTargetIds(XmlPullParser xmlPullParser, AttributeSet attributeSet, @NonNull Transition transition) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_TARGET);
                    int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (namedResourceId != 0) {
                        transition.addTarget(namedResourceId);
                    } else {
                        int namedResourceId2 = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (namedResourceId2 != 0) {
                            transition.excludeTarget(namedResourceId2, true);
                        } else {
                            String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (namedString != null) {
                                transition.addTarget(namedString);
                            } else {
                                String namedString2 = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (namedString2 != null) {
                                    transition.excludeTarget(namedString2, true);
                                } else {
                                    String namedString3 = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (namedString3 != null) {
                                        try {
                                            transition.excludeTarget(Class.forName(namedString3), true);
                                        } catch (ClassNotFoundException e) {
                                            typedArrayObtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + namedString3, e);
                                        }
                                    } else {
                                        String namedString4 = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (namedString4 != null) {
                                            transition.addTarget(Class.forName(namedString4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        return r1;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransitionManager createTransitionManagerFromXml(XmlPullParser xmlPullParser, AttributeSet attributeSet, @NonNull ViewGroup viewGroup) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int depth = xmlPullParser.getDepth();
        TransitionManager transitionManager = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("transitionManager")) {
                    transitionManager = new TransitionManager();
                } else {
                    if (!name.equals(AnimatedStateListDrawableCompat.ELEMENT_TRANSITION) || transitionManager == null) {
                        break;
                    }
                    loadTransition(attributeSet, xmlPullParser, viewGroup, transitionManager);
                }
            }
        }
        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
    }

    public final void loadTransition(AttributeSet attributeSet, XmlPullParser xmlPullParser, @NonNull ViewGroup viewGroup, TransitionManager transitionManager) throws Resources.NotFoundException {
        Transition transitionInflateTransition;
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_MANAGER);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlPullParser, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, 2, -1);
        int namedResourceId2 = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        Scene sceneForLayout = namedResourceId2 < 0 ? null : Scene.getSceneForLayout(viewGroup, namedResourceId2, this.mContext);
        int namedResourceId3 = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        Scene sceneForLayout2 = namedResourceId3 >= 0 ? Scene.getSceneForLayout(viewGroup, namedResourceId3, this.mContext) : null;
        if (namedResourceId >= 0 && (transitionInflateTransition = inflateTransition(namedResourceId)) != null) {
            if (sceneForLayout2 == null) {
                throw new RuntimeException("No toScene for transition ID " + namedResourceId);
            }
            if (sceneForLayout == null) {
                transitionManager.setTransition(sceneForLayout2, transitionInflateTransition);
            } else {
                transitionManager.setTransition(sceneForLayout, sceneForLayout2, transitionInflateTransition);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
