package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import androidx.core.location.GpsStatusWrapper;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes4.dex */
public class SVGAndroidRenderer {
    public static final float BEZIER_ARC_FACTOR = 0.5522848f;
    public static final String DEFAULT_FONT_FAMILY = "serif";
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;
    public static final String TAG = "SVGAndroidRenderer";
    public static HashSet<String> supportedFeatures;
    public Canvas canvas;
    public SVG document;
    public float dpi;
    public Stack<Matrix> matrixStack;
    public Stack<SVG.SvgContainer> parentStack;
    public CSSParser.RuleMatchContext ruleMatchContext = null;
    public RendererState state;
    public Stack<RendererState> stateStack;

    public static int clamp255(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public static void debug(String str, Object... objArr) {
    }

    public final float dotProduct(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    public class RendererState {
        public Paint fillPaint;
        public boolean hasFill;
        public boolean hasStroke;
        public boolean spacePreserve;
        public Paint strokePaint;
        public SVG.Style style;
        public SVG.Box viewBox;
        public SVG.Box viewPort;

        public RendererState() {
            Paint paint = new Paint();
            this.fillPaint = paint;
            paint.setFlags(GpsStatusWrapper.QZSS_SVID_MIN);
            this.fillPaint.setHinting(0);
            this.fillPaint.setStyle(Paint.Style.FILL);
            Paint paint2 = this.fillPaint;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.strokePaint = paint3;
            paint3.setFlags(GpsStatusWrapper.QZSS_SVID_MIN);
            this.strokePaint.setHinting(0);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setTypeface(typeface);
            this.style = SVG.Style.getDefaultStyle();
        }

        public RendererState(RendererState rendererState) {
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            SVG.Box box = rendererState.viewPort;
            if (box != null) {
                this.viewPort = new SVG.Box(box);
            }
            SVG.Box box2 = rendererState.viewBox;
            if (box2 != null) {
                this.viewBox = new SVG.Box(box2);
            }
            this.spacePreserve = rendererState.spacePreserve;
            try {
                this.style = (SVG.Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e) {
                Log.e(SVGAndroidRenderer.TAG, "Unexpected clone error", e);
                this.style = SVG.Style.getDefaultStyle();
            }
        }
    }

    public final void resetState() {
        this.state = new RendererState();
        this.stateStack = new Stack<>();
        updateStyle(this.state, SVG.Style.getDefaultStyle());
        RendererState rendererState = this.state;
        rendererState.viewPort = null;
        rendererState.spacePreserve = false;
        this.stateStack.push(new RendererState(rendererState));
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    public SVGAndroidRenderer(Canvas canvas, float f) {
        this.canvas = canvas;
        this.dpi = f;
    }

    public float getDPI() {
        return this.dpi;
    }

    public float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    public float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    public SVG.Box getCurrentViewPortInUserUnits() {
        RendererState rendererState = this.state;
        SVG.Box box = rendererState.viewBox;
        return box != null ? box : rendererState.viewPort;
    }

    public void renderDocument(SVG svg, RenderOptions renderOptions) {
        SVG.Box box;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptions == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.document = svg;
        SVG.Svg rootElement = svg.getRootElement();
        if (rootElement == null) {
            warn("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (renderOptions.hasView()) {
            SVG.SvgElementBase elementById = this.document.getElementById(renderOptions.viewId);
            if (elementById == null || !(elementById instanceof SVG.View)) {
                Log.w(TAG, String.format("View element with id \"%s\" not found.", renderOptions.viewId));
                return;
            }
            SVG.View view = (SVG.View) elementById;
            box = view.viewBox;
            if (box == null) {
                Log.w(TAG, String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptions.viewId));
                return;
            }
            preserveAspectRatio = view.preserveAspectRatio;
        } else {
            box = renderOptions.hasViewBox() ? renderOptions.viewBox : rootElement.viewBox;
            preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.preserveAspectRatio : rootElement.preserveAspectRatio;
        }
        if (renderOptions.hasCss()) {
            svg.addCSSRules(renderOptions.css);
        }
        if (renderOptions.hasTarget()) {
            CSSParser.RuleMatchContext ruleMatchContext = new CSSParser.RuleMatchContext();
            this.ruleMatchContext = ruleMatchContext;
            ruleMatchContext.targetElement = svg.getElementById(renderOptions.targetId);
        }
        resetState();
        checkXMLSpaceAttribute(rootElement);
        statePush();
        SVG.Box box2 = new SVG.Box(renderOptions.viewPort);
        SVG.Length length = rootElement.width;
        if (length != null) {
            box2.width = length.floatValue(this, box2.width);
        }
        SVG.Length length2 = rootElement.height;
        if (length2 != null) {
            box2.height = length2.floatValue(this, box2.height);
        }
        render(rootElement, box2, box, preserveAspectRatio);
        statePop();
        if (renderOptions.hasCss()) {
            svg.clearRenderCSSRules();
        }
    }

    public final void render(SVG.SvgObject svgObject) {
        if (svgObject instanceof SVG.NotDirectlyRendered) {
            return;
        }
        statePush();
        checkXMLSpaceAttribute(svgObject);
        if (svgObject instanceof SVG.Svg) {
            render((SVG.Svg) svgObject);
        } else if (svgObject instanceof SVG.Use) {
            render((SVG.Use) svgObject);
        } else if (svgObject instanceof SVG.Switch) {
            render((SVG.Switch) svgObject);
        } else if (svgObject instanceof SVG.Group) {
            render((SVG.Group) svgObject);
        } else if (svgObject instanceof SVG.Image) {
            render((SVG.Image) svgObject);
        } else if (svgObject instanceof SVG.Path) {
            render((SVG.Path) svgObject);
        } else if (svgObject instanceof SVG.Rect) {
            render((SVG.Rect) svgObject);
        } else if (svgObject instanceof SVG.Circle) {
            render((SVG.Circle) svgObject);
        } else if (svgObject instanceof SVG.Ellipse) {
            render((SVG.Ellipse) svgObject);
        } else if (svgObject instanceof SVG.Line) {
            render((SVG.Line) svgObject);
        } else if (svgObject instanceof SVG.Polygon) {
            render((SVG.Polygon) svgObject);
        } else if (svgObject instanceof SVG.PolyLine) {
            render((SVG.PolyLine) svgObject);
        } else if (svgObject instanceof SVG.Text) {
            render((SVG.Text) svgObject);
        }
        statePop();
    }

    public final void renderChildren(SVG.SvgContainer svgContainer, boolean z) {
        if (z) {
            parentPush(svgContainer);
        }
        Iterator<SVG.SvgObject> it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            render(it.next());
        }
        if (z) {
            parentPop();
        }
    }

    public final void statePush() {
        this.canvas.save();
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    public final void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    public final void parentPush(SVG.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    public final void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    public final void updateStyleForElement(RendererState rendererState, SVG.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        SVG.Style style = svgElementBase.baseStyle;
        if (style != null) {
            updateStyle(rendererState, style);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule rule : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, rule.selector, svgElementBase)) {
                    updateStyle(rendererState, rule.style);
                }
            }
        }
        SVG.Style style2 = svgElementBase.style;
        if (style2 != null) {
            updateStyle(rendererState, style2);
        }
    }

    public final void checkXMLSpaceAttribute(SVG.SvgObject svgObject) {
        Boolean bool;
        if ((svgObject instanceof SVG.SvgElementBase) && (bool = ((SVG.SvgElementBase) svgObject).spacePreserve) != null) {
            this.state.spacePreserve = bool.booleanValue();
        }
    }

    public final void doFilledPath(SVG.SvgElement svgElement, Path path) {
        SVG.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            SVG.SvgObject svgObjectResolveIRI = this.document.resolveIRI(((SVG.PaintReference) svgPaint).href);
            if (svgObjectResolveIRI instanceof SVG.Pattern) {
                fillWithPattern(svgElement, path, (SVG.Pattern) svgObjectResolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    public final void doStroke(Path path) {
        RendererState rendererState = this.state;
        if (rendererState.style.vectorEffect == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.canvas.setMatrix(new Matrix());
            Shader shader = this.state.strokePaint.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.canvas.drawPath(path2, this.state.strokePaint);
            this.canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.canvas.drawPath(path, rendererState.strokePaint);
    }

    public static void warn(String str, Object... objArr) {
        Log.w(TAG, String.format(str, objArr));
    }

    public static void error(String str, Object... objArr) {
        Log.e(TAG, String.format(str, objArr));
    }

    public final void render(SVG.Svg svg) {
        render(svg, makeViewPort(svg.f561x, svg.f562y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    public final void render(SVG.Svg svg, SVG.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    public final void render(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.preserveAspectRatio) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, svg);
        if (display()) {
            RendererState rendererState = this.state;
            rendererState.viewPort = box;
            if (!rendererState.style.overflow.booleanValue()) {
                SVG.Box box3 = this.state.viewPort;
                setClipRect(box3.minX, box3.minY, box3.width, box3.height);
            }
            checkForClipPath(svg, this.state.viewPort);
            if (box2 != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                this.state.viewBox = svg.viewBox;
            } else {
                Canvas canvas = this.canvas;
                SVG.Box box4 = this.state.viewPort;
                canvas.translate(box4.minX, box4.minY);
            }
            boolean zPushLayer = pushLayer();
            viewportFill();
            renderChildren(svg, true);
            if (zPushLayer) {
                popLayer(svg);
            }
            updateParentBoundingBox(svg);
        }
    }

    public final SVG.Box makeViewPort(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
        return new SVG.Box(fFloatValueX, fFloatValueY, length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : currentViewPortInUserUnits.height);
    }

    public final void render(SVG.Group group) {
        debug("Group render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            Matrix matrix = group.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(group);
            boolean zPushLayer = pushLayer();
            renderChildren(group, true);
            if (zPushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    public final void updateParentBoundingBox(SVG.SvgElement svgElement) {
        if (svgElement.parent == null || svgElement.boundingBox == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.matrixStack.peek().invert(matrix)) {
            SVG.Box box = svgElement.boundingBox;
            float f = box.minX;
            float f2 = box.minY;
            float fMaxX = box.maxX();
            SVG.Box box2 = svgElement.boundingBox;
            float f3 = box2.minY;
            float fMaxX2 = box2.maxX();
            float fMaxY = svgElement.boundingBox.maxY();
            SVG.Box box3 = svgElement.boundingBox;
            float[] fArr = {f, f2, fMaxX, f3, fMaxX2, fMaxY, box3.minX, box3.maxY()};
            matrix.preConcat(this.canvas.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            SVG.SvgElement svgElement2 = (SVG.SvgElement) this.parentStack.peek();
            SVG.Box box4 = svgElement2.boundingBox;
            if (box4 == null) {
                svgElement2.boundingBox = SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                box4.union(SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    public final boolean pushLayer() {
        SVG.SvgObject svgObjectResolveIRI;
        if (!requiresCompositing()) {
            return false;
        }
        this.canvas.saveLayerAlpha(null, clamp255(this.state.style.opacity.floatValue()), 31);
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        String str = rendererState.style.mask;
        if (str != null && ((svgObjectResolveIRI = this.document.resolveIRI(str)) == null || !(svgObjectResolveIRI instanceof SVG.Mask))) {
            error("Mask reference '%s' not found", this.state.style.mask);
            this.state.style.mask = null;
        }
        return true;
    }

    public final void popLayer(SVG.SvgElement svgElement) {
        popLayer(svgElement, svgElement.boundingBox);
    }

    public final void popLayer(SVG.SvgElement svgElement, SVG.Box box) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.canvas.saveLayer(null, paint2, 31);
            SVG.Mask mask = (SVG.Mask) this.document.resolveIRI(this.state.style.mask);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.canvas.saveLayer(null, paint3, 31);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    public final boolean requiresCompositing() {
        return this.state.style.opacity.floatValue() < 1.0f || this.state.style.mask != null;
    }

    public final void render(SVG.Switch r3) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, r3);
        if (display()) {
            Matrix matrix = r3.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(r3);
            boolean zPushLayer = pushLayer();
            renderSwitchChild(r3);
            if (zPushLayer) {
                popLayer(r3);
            }
            updateParentBoundingBox(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void renderSwitchChild(SVG.Switch r8) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        SVGExternalFileResolver fileResolver = SVG.getFileResolver();
        for (SVG.SvgObject svgObject : r8.getChildren()) {
            if (svgObject instanceof SVG.SvgConditional) {
                SVG.SvgConditional svgConditional = (SVG.SvgConditional) svgObject;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (requiredFeatures.isEmpty() || !supportedFeatures.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && fileResolver != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (it.hasNext()) {
                                if (!fileResolver.isFormatSupported(it.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = svgConditional.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && fileResolver != null) {
                            Iterator<String> it2 = requiredFonts.iterator();
                            while (it2.hasNext()) {
                                if (fileResolver.resolveFont(it2.next(), this.state.style.fontWeight.intValue(), String.valueOf(this.state.style.fontStyle)) == null) {
                                    break;
                                }
                            }
                        }
                    }
                    render(svgObject);
                    return;
                }
            }
        }
    }

    public static synchronized void initialiseSupportedFeaturesMap() {
        HashSet<String> hashSet = new HashSet<>();
        supportedFeatures = hashSet;
        hashSet.add("Structure");
        supportedFeatures.add("BasicStructure");
        supportedFeatures.add("ConditionalProcessing");
        supportedFeatures.add("Image");
        supportedFeatures.add("Style");
        supportedFeatures.add("ViewportAttribute");
        supportedFeatures.add("Shape");
        supportedFeatures.add("BasicText");
        supportedFeatures.add("PaintAttribute");
        supportedFeatures.add("BasicPaintAttribute");
        supportedFeatures.add("OpacityAttribute");
        supportedFeatures.add("BasicGraphicsAttribute");
        supportedFeatures.add("Marker");
        supportedFeatures.add("Gradient");
        supportedFeatures.add("Pattern");
        supportedFeatures.add("Clip");
        supportedFeatures.add("BasicClip");
        supportedFeatures.add("Mask");
        supportedFeatures.add("View");
    }

    public final void render(SVG.Use use) {
        debug("Use render", new Object[0]);
        SVG.Length length = use.width;
        if (length == null || !length.isZero()) {
            SVG.Length length2 = use.height;
            if (length2 == null || !length2.isZero()) {
                updateStyleForElement(this.state, use);
                if (display()) {
                    SVG.SvgObject svgObjectResolveIRI = use.document.resolveIRI(use.href);
                    if (svgObjectResolveIRI == null) {
                        error("Use reference '%s' not found", use.href);
                        return;
                    }
                    Matrix matrix = use.transform;
                    if (matrix != null) {
                        this.canvas.concat(matrix);
                    }
                    SVG.Length length3 = use.f585x;
                    float fFloatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
                    SVG.Length length4 = use.f586y;
                    this.canvas.translate(fFloatValueX, length4 != null ? length4.floatValueY(this) : 0.0f);
                    checkForClipPath(use);
                    boolean zPushLayer = pushLayer();
                    parentPush(use);
                    if (svgObjectResolveIRI instanceof SVG.Svg) {
                        SVG.Box boxMakeViewPort = makeViewPort(null, null, use.width, use.height);
                        statePush();
                        render((SVG.Svg) svgObjectResolveIRI, boxMakeViewPort);
                        statePop();
                    } else if (svgObjectResolveIRI instanceof SVG.Symbol) {
                        SVG.Length length5 = use.width;
                        if (length5 == null) {
                            length5 = new SVG.Length(100.0f, SVG.Unit.percent);
                        }
                        SVG.Length length6 = use.height;
                        if (length6 == null) {
                            length6 = new SVG.Length(100.0f, SVG.Unit.percent);
                        }
                        SVG.Box boxMakeViewPort2 = makeViewPort(null, null, length5, length6);
                        statePush();
                        render((SVG.Symbol) svgObjectResolveIRI, boxMakeViewPort2);
                        statePop();
                    } else {
                        render(svgObjectResolveIRI);
                    }
                    parentPop();
                    if (zPushLayer) {
                        popLayer(use);
                    }
                    updateParentBoundingBox(use);
                }
            }
        }
    }

    public final void render(SVG.Path path) {
        debug("Path render", new Object[0]);
        if (path.f554d == null) {
            return;
        }
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = path.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path path2 = new PathConverter(path.f554d).getPath();
                if (path.boundingBox == null) {
                    path.boundingBox = calculatePathBounds(path2);
                }
                updateParentBoundingBox(path);
                checkForGradientsAndPatterns(path);
                checkForClipPath(path);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    path2.setFillType(getFillTypeFromState());
                    doFilledPath(path, path2);
                }
                if (this.state.hasStroke) {
                    doStroke(path2);
                }
                renderMarkers(path);
                if (zPushLayer) {
                    popLayer(path);
                }
            }
        }
    }

    public final SVG.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final void render(SVG.Rect rect) {
        debug("Rect render", new Object[0]);
        SVG.Length length = rect.width;
        if (length == null || rect.height == null || length.isZero() || rect.height.isZero()) {
            return;
        }
        updateStyleForElement(this.state, rect);
        if (display() && visible()) {
            Matrix matrix = rect.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(rect);
            updateParentBoundingBox(rect);
            checkForGradientsAndPatterns(rect);
            checkForClipPath(rect);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(rect, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(rect);
            }
        }
    }

    public final void render(SVG.Circle circle) {
        debug("Circle render", new Object[0]);
        SVG.Length length = circle.f541r;
        if (length == null || length.isZero()) {
            return;
        }
        updateStyleForElement(this.state, circle);
        if (display() && visible()) {
            Matrix matrix = circle.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(circle);
            updateParentBoundingBox(circle);
            checkForGradientsAndPatterns(circle);
            checkForClipPath(circle);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(circle, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(circle);
            }
        }
    }

    public final void render(SVG.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        SVG.Length length = ellipse.f544rx;
        if (length == null || ellipse.f545ry == null || length.isZero() || ellipse.f545ry.isZero()) {
            return;
        }
        updateStyleForElement(this.state, ellipse);
        if (display() && visible()) {
            Matrix matrix = ellipse.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(ellipse);
            updateParentBoundingBox(ellipse);
            checkForGradientsAndPatterns(ellipse);
            checkForClipPath(ellipse);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(ellipse, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(ellipse);
            }
        }
    }

    public final void render(SVG.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            Matrix matrix = line.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean zPushLayer = pushLayer();
            doStroke(pathMakePathAndBoundingBox);
            renderMarkers(line);
            if (zPushLayer) {
                popLayer(line);
            }
        }
    }

    public final List<MarkerVector> calculateMarkerPositions(SVG.Line line) {
        SVG.Length length = line.f548x1;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = line.f550y1;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Length length3 = line.f549x2;
        float fFloatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
        SVG.Length length4 = line.f551y2;
        float fFloatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f = fFloatValueX2 - fFloatValueX;
        float f2 = fFloatValueY2 - fFloatValueY;
        arrayList.add(new MarkerVector(fFloatValueX, fFloatValueY, f, f2));
        arrayList.add(new MarkerVector(fFloatValueX2, fFloatValueY2, f, f2));
        return arrayList;
    }

    public final void render(SVG.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polyLine.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                if (polyLine.points.length < 2) {
                    return;
                }
                Path pathMakePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                updateParentBoundingBox(polyLine);
                pathMakePathAndBoundingBox.setFillType(getFillTypeFromState());
                checkForGradientsAndPatterns(polyLine);
                checkForClipPath(polyLine);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polyLine, pathMakePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(pathMakePathAndBoundingBox);
                }
                renderMarkers(polyLine);
                if (zPushLayer) {
                    popLayer(polyLine);
                }
            }
        }
    }

    public final List<MarkerVector> calculateMarkerPositions(SVG.PolyLine polyLine) {
        int length = polyLine.points.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = polyLine.points;
        MarkerVector markerVector = new MarkerVector(fArr[0], fArr[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr2 = polyLine.points;
            float f3 = fArr2[i];
            float f4 = fArr2[i + 1];
            markerVector.add(f3, f4);
            arrayList.add(markerVector);
            i += 2;
            markerVector = new MarkerVector(f3, f4, f3 - markerVector.f589x, f4 - markerVector.f590y);
            f2 = f4;
            f = f3;
        }
        if (polyLine instanceof SVG.Polygon) {
            float[] fArr3 = polyLine.points;
            float f5 = fArr3[0];
            if (f != f5) {
                float f6 = fArr3[1];
                if (f2 != f6) {
                    markerVector.add(f5, f6);
                    arrayList.add(markerVector);
                    MarkerVector markerVector2 = new MarkerVector(f5, f6, f5 - markerVector.f589x, f6 - markerVector.f590y);
                    markerVector2.add((MarkerVector) arrayList.get(0));
                    arrayList.add(markerVector2);
                    arrayList.set(0, markerVector2);
                }
            }
        } else {
            arrayList.add(markerVector);
        }
        return arrayList;
    }

    public final void render(SVG.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polygon.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                if (polygon.points.length < 2) {
                    return;
                }
                Path pathMakePathAndBoundingBox = makePathAndBoundingBox(polygon);
                updateParentBoundingBox(polygon);
                checkForGradientsAndPatterns(polygon);
                checkForClipPath(polygon);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polygon, pathMakePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(pathMakePathAndBoundingBox);
                }
                renderMarkers(polygon);
                if (zPushLayer) {
                    popLayer(polygon);
                }
            }
        }
    }

    public final void render(SVG.Text text) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix = text.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            List<SVG.Length> list = text.f575x;
            float fFloatValueY = 0.0f;
            float fFloatValueX = (list == null || list.size() == 0) ? 0.0f : text.f575x.get(0).floatValueX(this);
            List<SVG.Length> list2 = text.f576y;
            float fFloatValueY2 = (list2 == null || list2.size() == 0) ? 0.0f : text.f576y.get(0).floatValueY(this);
            List<SVG.Length> list3 = text.f573dx;
            float fFloatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.f573dx.get(0).floatValueX(this);
            List<SVG.Length> list4 = text.f574dy;
            if (list4 != null && list4.size() != 0) {
                fFloatValueY = text.f574dy.get(0).floatValueY(this);
            }
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(text);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    fCalculateTextWidth /= 2.0f;
                }
                fFloatValueX -= fCalculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fFloatValueX, fFloatValueY2);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean zPushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(fFloatValueX + fFloatValueX2, fFloatValueY2 + fFloatValueY));
            if (zPushLayer) {
                popLayer(text);
            }
        }
    }

    public final SVG.Style.TextAnchor getAnchorPosition() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.state.style;
        if (style.direction == SVG.Style.TextDirection.LTR || (textAnchor = style.textAnchor) == SVG.Style.TextAnchor.Middle) {
            return style.textAnchor;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    /* loaded from: classes6.dex */
    public class PlainTextDrawer extends TextProcessor {

        /* renamed from: x */
        public float f591x;

        /* renamed from: y */
        public float f592y;

        public PlainTextDrawer(float f, float f2) {
            super(SVGAndroidRenderer.this, null);
            this.f591x = f;
            this.f592y = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.f591x, this.f592y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.f591x, this.f592y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.f591x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    public abstract class TextProcessor {
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);

        public TextProcessor() {
        }

        public /* synthetic */ TextProcessor(SVGAndroidRenderer sVGAndroidRenderer, C66591 c66591) {
            this();
        }
    }

    public final void enumerateTextSpans(SVG.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator<SVG.SvgObject> it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject next = it.next();
                if (next instanceof SVG.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVG.TextSequence) next).text, z, !it.hasNext()));
                } else {
                    processTextChild(next, textProcessor);
                }
                z = false;
            }
        }
    }

    public final void processTextChild(SVG.SvgObject svgObject, TextProcessor textProcessor) {
        float f;
        float fFloatValueY;
        float fFloatValueX;
        SVG.Style.TextAnchor anchorPosition;
        if (textProcessor.doTextContainer((SVG.TextContainer) svgObject)) {
            if (svgObject instanceof SVG.TextPath) {
                statePush();
                renderTextPath((SVG.TextPath) svgObject);
                statePop();
                return;
            }
            if (svgObject instanceof SVG.TSpan) {
                debug("TSpan render", new Object[0]);
                statePush();
                SVG.TSpan tSpan = (SVG.TSpan) svgObject;
                updateStyleForElement(this.state, tSpan);
                if (display()) {
                    List<SVG.Length> list = tSpan.f575x;
                    boolean z = list != null && list.size() > 0;
                    boolean z2 = textProcessor instanceof PlainTextDrawer;
                    float fFloatValueY2 = 0.0f;
                    if (z2) {
                        float fFloatValueX2 = !z ? ((PlainTextDrawer) textProcessor).f591x : tSpan.f575x.get(0).floatValueX(this);
                        List<SVG.Length> list2 = tSpan.f576y;
                        fFloatValueY = (list2 == null || list2.size() == 0) ? ((PlainTextDrawer) textProcessor).f592y : tSpan.f576y.get(0).floatValueY(this);
                        List<SVG.Length> list3 = tSpan.f573dx;
                        fFloatValueX = (list3 == null || list3.size() == 0) ? 0.0f : tSpan.f573dx.get(0).floatValueX(this);
                        List<SVG.Length> list4 = tSpan.f574dy;
                        if (list4 != null && list4.size() != 0) {
                            fFloatValueY2 = tSpan.f574dy.get(0).floatValueY(this);
                        }
                        f = fFloatValueY2;
                        fFloatValueY2 = fFloatValueX2;
                    } else {
                        f = 0.0f;
                        fFloatValueY = 0.0f;
                        fFloatValueX = 0.0f;
                    }
                    if (z && (anchorPosition = getAnchorPosition()) != SVG.Style.TextAnchor.Start) {
                        float fCalculateTextWidth = calculateTextWidth(tSpan);
                        if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                            fCalculateTextWidth /= 2.0f;
                        }
                        fFloatValueY2 -= fCalculateTextWidth;
                    }
                    checkForGradientsAndPatterns((SVG.SvgElement) tSpan.getTextRoot());
                    if (z2) {
                        PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                        plainTextDrawer.f591x = fFloatValueY2 + fFloatValueX;
                        plainTextDrawer.f592y = fFloatValueY + f;
                    }
                    boolean zPushLayer = pushLayer();
                    enumerateTextSpans(tSpan, textProcessor);
                    if (zPushLayer) {
                        popLayer(tSpan);
                    }
                }
                statePop();
                return;
            }
            if (svgObject instanceof SVG.TRef) {
                statePush();
                SVG.TRef tRef = (SVG.TRef) svgObject;
                updateStyleForElement(this.state, tRef);
                if (display()) {
                    checkForGradientsAndPatterns((SVG.SvgElement) tRef.getTextRoot());
                    SVG.SvgObject svgObjectResolveIRI = svgObject.document.resolveIRI(tRef.href);
                    if (svgObjectResolveIRI != null && (svgObjectResolveIRI instanceof SVG.TextContainer)) {
                        StringBuilder sb = new StringBuilder();
                        extractRawText((SVG.TextContainer) svgObjectResolveIRI, sb);
                        if (sb.length() > 0) {
                            textProcessor.processText(sb.toString());
                        }
                    } else {
                        error("Tref reference '%s' not found", tRef.href);
                    }
                }
                statePop();
            }
        }
    }

    public final void renderTextPath(SVG.TextPath textPath) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            SVG.SvgObject svgObjectResolveIRI = textPath.document.resolveIRI(textPath.href);
            if (svgObjectResolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVG.Path path = (SVG.Path) svgObjectResolveIRI;
            Path path2 = new PathConverter(path.f554d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(path2, false);
            SVG.Length length = textPath.startOffset;
            float fFloatValue = length != null ? length.floatValue(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(textPath);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    fCalculateTextWidth /= 2.0f;
                }
                fFloatValue -= fCalculateTextWidth;
            }
            checkForGradientsAndPatterns((SVG.SvgElement) textPath.getTextRoot());
            boolean zPushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(path2, fFloatValue, 0.0f));
            if (zPushLayer) {
                popLayer(textPath);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class PathTextDrawer extends PlainTextDrawer {
        public Path path;

        public PathTextDrawer(Path path, float f, float f2) {
            super(f, f2);
            this.path = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer, com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.f591x, this.f592y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.f591x, this.f592y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.f591x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    public final float calculateTextWidth(SVG.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator(this, null);
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.f597x;
    }

    /* loaded from: classes6.dex */
    public class TextWidthCalculator extends TextProcessor {

        /* renamed from: x */
        public float f597x;

        public TextWidthCalculator() {
            super(SVGAndroidRenderer.this, null);
            this.f597x = 0.0f;
        }

        public /* synthetic */ TextWidthCalculator(SVGAndroidRenderer sVGAndroidRenderer, C66591 c66591) {
            this();
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            this.f597x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    /* loaded from: classes6.dex */
    public class TextBoundsCalculator extends TextProcessor {
        public RectF bbox;

        /* renamed from: x */
        public float f595x;

        /* renamed from: y */
        public float f596y;

        public TextBoundsCalculator(float f, float f2) {
            super(SVGAndroidRenderer.this, null);
            this.bbox = new RectF();
            this.f595x = f;
            this.f596y = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG.SvgObject svgObjectResolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (svgObjectResolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVG.Path path = (SVG.Path) svgObjectResolveIRI;
            Path path2 = SVGAndroidRenderer.this.new PathConverter(path.f554d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f595x, this.f596y);
                this.bbox.union(rectF);
            }
            this.f595x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    public final void extractRawText(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator<SVG.SvgObject> it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject next = it.next();
            if (next instanceof SVG.TextContainer) {
                extractRawText((SVG.TextContainer) next, sb);
            } else if (next instanceof SVG.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVG.TextSequence) next).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (this.state.spacePreserve) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void render(SVG.Symbol symbol, SVG.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, symbol);
        RendererState rendererState = this.state;
        rendererState.viewPort = box;
        if (!rendererState.style.overflow.booleanValue()) {
            SVG.Box box2 = this.state.viewPort;
            setClipRect(box2.minX, box2.minY, box2.width, box2.height);
        }
        SVG.Box box3 = symbol.viewBox;
        if (box3 != null) {
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box3, preserveAspectRatio));
            this.state.viewBox = symbol.viewBox;
        } else {
            Canvas canvas = this.canvas;
            SVG.Box box4 = this.state.viewPort;
            canvas.translate(box4.minX, box4.minY);
        }
        boolean zPushLayer = pushLayer();
        renderChildren(symbol, true);
        if (zPushLayer) {
            popLayer(symbol);
        }
        updateParentBoundingBox(symbol);
    }

    public final void render(SVG.Image image) {
        SVG.Length length;
        String str;
        debug("Image render", new Object[0]);
        SVG.Length length2 = image.width;
        if (length2 == null || length2.isZero() || (length = image.height) == null || length.isZero() || (str = image.href) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        Bitmap bitmapCheckForImageDataURL = checkForImageDataURL(str);
        if (bitmapCheckForImageDataURL == null) {
            SVGExternalFileResolver fileResolver = SVG.getFileResolver();
            if (fileResolver == null) {
                return;
            } else {
                bitmapCheckForImageDataURL = fileResolver.resolveImage(image.href);
            }
        }
        if (bitmapCheckForImageDataURL == null) {
            error("Could not locate image '%s'", image.href);
            return;
        }
        SVG.Box box = new SVG.Box(0.0f, 0.0f, bitmapCheckForImageDataURL.getWidth(), bitmapCheckForImageDataURL.getHeight());
        updateStyleForElement(this.state, image);
        if (display() && visible()) {
            Matrix matrix = image.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            SVG.Length length3 = image.f546x;
            float fFloatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVG.Length length4 = image.f547y;
            this.state.viewPort = new SVG.Box(fFloatValueX, length4 != null ? length4.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
            if (!this.state.style.overflow.booleanValue()) {
                SVG.Box box2 = this.state.viewPort;
                setClipRect(box2.minX, box2.minY, box2.width, box2.height);
            }
            image.boundingBox = this.state.viewPort;
            updateParentBoundingBox(image);
            checkForClipPath(image);
            boolean zPushLayer = pushLayer();
            viewportFill();
            this.canvas.save();
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
            this.canvas.drawBitmap(bitmapCheckForImageDataURL, 0.0f, 0.0f, new Paint(this.state.style.imageRendering != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.canvas.restore();
            if (zPushLayer) {
                popLayer(image);
            }
        }
    }

    public final Bitmap checkForImageDataURL(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !DataUrlLoader.BASE64_TAG.equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            Log.e(TAG, "Could not decode bad Data URL", e);
            return null;
        }
    }

    public final boolean display() {
        Boolean bool = this.state.style.display;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean visible() {
        Boolean bool = this.state.style.visibility;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix calculateViewBoxTransform(SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        int i;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.getAlignment() != null) {
            float f3 = box.width / box2.width;
            float f4 = box.height / box2.height;
            float f5 = -box2.minX;
            float f6 = -box2.minY;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float fMax = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = box.width / fMax;
            float f8 = box.height / fMax;
            int[] iArr = C66591.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment;
            switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (box2.width - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = box2.width - f7;
                    break;
                default:
                    i = iArr[preserveAspectRatio.getAlignment().ordinal()];
                    if (i == 2) {
                        f = (box2.height - f8) / 2.0f;
                        f6 -= f;
                        matrix.preTranslate(box.minX, box.minY);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f5, f6);
                        break;
                    } else {
                        if (i != 3) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i != 7) {
                                        break;
                                    }
                                }
                            }
                            f = (box2.height - f8) / 2.0f;
                            f6 -= f;
                            matrix.preTranslate(box.minX, box.minY);
                            matrix.preScale(fMax, fMax);
                            matrix.preTranslate(f5, f6);
                        }
                        f = box2.height - f8;
                        f6 -= f;
                        matrix.preTranslate(box.minX, box.minY);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f5, f6);
                    }
            }
            f5 -= f2;
            i = iArr[preserveAspectRatio.getAlignment().ordinal()];
            if (i == 2) {
            }
        }
        return matrix;
    }

    public final boolean isSpecified(SVG.Style style, long j) {
        return (style.specifiedFlags & j) != 0;
    }

    public final void updateStyle(RendererState rendererState, SVG.Style style) {
        if (isSpecified(style, 4096L)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, 2048L)) {
            rendererState.style.opacity = style.opacity;
        }
        if (isSpecified(style, 1L)) {
            rendererState.style.fill = style.fill;
            SVG.SvgPaint svgPaint = style.fill;
            rendererState.hasFill = (svgPaint == null || svgPaint == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4L)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149L)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2L)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8L)) {
            rendererState.style.stroke = style.stroke;
            SVG.SvgPaint svgPaint2 = style.stroke;
            rendererState.hasStroke = (svgPaint2 == null || svgPaint2 == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16L)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168L)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, SVG.SPECIFIED_VECTOR_EFFECT)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32L)) {
            SVG.Style style2 = rendererState.style;
            SVG.Length length = style.strokeWidth;
            style2.strokeWidth = length;
            rendererState.strokePaint.setStrokeWidth(length.floatValue(this));
        }
        if (isSpecified(style, 64L)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            int i = C66591.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[style.strokeLineCap.ordinal()];
            if (i == 1) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128L)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            int i2 = C66591.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[style.strokeLineJoin.ordinal()];
            if (i2 == 1) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256L)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512L)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024L)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        Typeface typefaceCheckGenericFont = null;
        if (isSpecified(style, 1536L)) {
            SVG.Length[] lengthArr = rendererState.style.strokeDashArray;
            if (lengthArr == null) {
                rendererState.strokePaint.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i3 = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float fFloatValue = rendererState.style.strokeDashArray[i4 % length2].floatValue(this);
                    fArr[i4] = fFloatValue;
                    f += fFloatValue;
                }
                if (f == 0.0f) {
                    rendererState.strokePaint.setPathEffect(null);
                } else {
                    float fFloatValue2 = rendererState.style.strokeDashOffset.floatValue(this);
                    if (fFloatValue2 < 0.0f) {
                        fFloatValue2 = (fFloatValue2 % f) + f;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, fFloatValue2));
                }
            }
        }
        if (isSpecified(style, 16384L)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, 8192L)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, 32768L)) {
            if (style.fontWeight.intValue() == -1 && rendererState.style.fontWeight.intValue() > 100) {
                SVG.Style style3 = rendererState.style;
                style3.fontWeight = Integer.valueOf(style3.fontWeight.intValue() - 100);
            } else if (style.fontWeight.intValue() == 1 && rendererState.style.fontWeight.intValue() < 900) {
                SVG.Style style4 = rendererState.style;
                style4.fontWeight = Integer.valueOf(style4.fontWeight.intValue() + 100);
            } else {
                rendererState.style.fontWeight = style.fontWeight;
            }
        }
        if (isSpecified(style, 65536L)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496L)) {
            if (rendererState.style.fontFamily != null && this.document != null) {
                SVGExternalFileResolver fileResolver = SVG.getFileResolver();
                for (String str : rendererState.style.fontFamily) {
                    SVG.Style style5 = rendererState.style;
                    Typeface typefaceCheckGenericFont2 = checkGenericFont(str, style5.fontWeight, style5.fontStyle);
                    typefaceCheckGenericFont = (typefaceCheckGenericFont2 != null || fileResolver == null) ? typefaceCheckGenericFont2 : fileResolver.resolveFont(str, rendererState.style.fontWeight.intValue(), String.valueOf(rendererState.style.fontStyle));
                    if (typefaceCheckGenericFont != null) {
                        break;
                    }
                }
            }
            if (typefaceCheckGenericFont == null) {
                SVG.Style style6 = rendererState.style;
                typefaceCheckGenericFont = checkGenericFont("serif", style6.fontWeight, style6.fontStyle);
            }
            rendererState.fillPaint.setTypeface(typefaceCheckGenericFont);
            rendererState.strokePaint.setTypeface(typefaceCheckGenericFont);
        }
        if (isSpecified(style, 131072L)) {
            rendererState.style.textDecoration = style.textDecoration;
            Paint paint = rendererState.fillPaint;
            SVG.Style.TextDecoration textDecoration = style.textDecoration;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = rendererState.fillPaint;
            SVG.Style.TextDecoration textDecoration3 = style.textDecoration;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            rendererState.strokePaint.setStrikeThruText(style.textDecoration == textDecoration2);
            rendererState.strokePaint.setUnderlineText(style.textDecoration == textDecoration4);
        }
        if (isSpecified(style, SVG.SPECIFIED_DIRECTION)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, 262144L)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, 524288L)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, 2097152L)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304L)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, SVG.SPECIFIED_MARKER_END)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216L)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, SVG.SPECIFIED_VISIBILITY)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, 1048576L)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, SVG.SPECIFIED_CLIP_PATH)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, SVG.SPECIFIED_CLIP_RULE)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824L)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, SVG.SPECIFIED_STOP_COLOR)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, SVG.SPECIFIED_STOP_OPACITY)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, SVG.SPECIFIED_VIEWPORT_FILL_OPACITY)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, SVG.SPECIFIED_IMAGE_RENDERING)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGAndroidRenderer$1 */
    public static /* synthetic */ class C66591 {
        public static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment;
        public static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap;
        public static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public final void setPaintColour(RendererState rendererState, boolean z, SVG.SvgPaint svgPaint) {
        int i;
        SVG.Style style = rendererState.style;
        float fFloatValue = (z ? style.fillOpacity : style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = rendererState.style.color.colour;
        }
        int iColourWithOpacity = colourWithOpacity(i, fFloatValue);
        if (z) {
            rendererState.fillPaint.setColor(iColourWithOpacity);
        } else {
            rendererState.strokePaint.setColor(iColourWithOpacity);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface checkGenericFont(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        char c = 2;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.hashCode();
        switch (str.hashCode()) {
            case -1536685117:
                if (!str.equals("sans-serif")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                break;
            case -1081737434:
                if (!str.equals("fantasy")) {
                }
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
        }
        return Typeface.create(Typeface.SANS_SERIF, i);
    }

    public static int colourWithOpacity(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    public final Path.FillType getFillTypeFromState() {
        SVG.Style.FillRule fillRule = this.state.style.fillRule;
        if (fillRule != null && fillRule == SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public final void setClipRect(float f, float f2, float f3, float f4) {
        float fFloatValueX = f3 + f;
        float fFloatValueY = f4 + f2;
        SVG.CSSClipRect cSSClipRect = this.state.style.clip;
        if (cSSClipRect != null) {
            f += cSSClipRect.left.floatValueX(this);
            f2 += this.state.style.clip.top.floatValueY(this);
            fFloatValueX -= this.state.style.clip.right.floatValueX(this);
            fFloatValueY -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, fFloatValueX, fFloatValueY);
    }

    public final void viewportFill() {
        int iColourWithOpacity;
        SVG.Style style = this.state.style;
        SVG.SvgPaint svgPaint = style.viewportFill;
        if (svgPaint instanceof SVG.Colour) {
            iColourWithOpacity = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            iColourWithOpacity = style.color.colour;
        }
        Float f = style.viewportFillOpacity;
        if (f != null) {
            iColourWithOpacity = colourWithOpacity(iColourWithOpacity, f.floatValue());
        }
        this.canvas.drawColor(iColourWithOpacity);
    }

    /* loaded from: classes6.dex */
    public class PathConverter implements SVG.PathInterface {
        public float lastX;
        public float lastY;
        public Path path = new Path();

        public PathConverter(SVG.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
        }

        public Path getPath() {
            return this.path;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void close() {
            this.path.close();
        }
    }

    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        float f8;
        SVG.PathInterface pathInterface2;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f) {
            f8 = f6;
            pathInterface2 = pathInterface;
        } else {
            if (f4 != 0.0f) {
                float fAbs = Math.abs(f3);
                float fAbs2 = Math.abs(f4);
                double radians = Math.toRadians(f5 % 360.0d);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                double d = (f - f6) / 2.0d;
                double d2 = (f2 - f7) / 2.0d;
                double d3 = (dCos * d) + (dSin * d2);
                double d4 = ((-dSin) * d) + (d2 * dCos);
                double d5 = fAbs * fAbs;
                double d6 = fAbs2 * fAbs2;
                double d7 = d3 * d3;
                double d8 = d4 * d4;
                double d9 = (d7 / d5) + (d8 / d6);
                if (d9 > 0.99999d) {
                    double dSqrt = Math.sqrt(d9) * 1.00001d;
                    fAbs = (float) (fAbs * dSqrt);
                    fAbs2 = (float) (dSqrt * fAbs2);
                    d5 = fAbs * fAbs;
                    d6 = fAbs2 * fAbs2;
                }
                double d10 = z == z2 ? -1.0d : 1.0d;
                double d11 = d5 * d6;
                double d12 = d5 * d8;
                double d13 = d6 * d7;
                double d14 = ((d11 - d12) - d13) / (d12 + d13);
                if (d14 < 0.0d) {
                    d14 = 0.0d;
                }
                double dSqrt2 = d10 * Math.sqrt(d14);
                double d15 = fAbs;
                double d16 = fAbs2;
                double d17 = ((d15 * d4) / d16) * dSqrt2;
                float f9 = fAbs;
                float f10 = fAbs2;
                double d18 = dSqrt2 * (-((d16 * d3) / d15));
                double d19 = ((f + f6) / 2.0d) + ((dCos * d17) - (dSin * d18));
                double d20 = ((f2 + f7) / 2.0d) + (dSin * d17) + (dCos * d18);
                double d21 = (d3 - d17) / d15;
                double d22 = (d4 - d18) / d16;
                double d23 = ((-d3) - d17) / d15;
                double d24 = ((-d4) - d18) / d16;
                double d25 = (d21 * d21) + (d22 * d22);
                double dAcos = (d22 < 0.0d ? -1.0d : 1.0d) * Math.acos(d21 / Math.sqrt(d25));
                double dCheckedArcCos = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * checkedArcCos(((d21 * d23) + (d22 * d24)) / Math.sqrt(d25 * ((d23 * d23) + (d24 * d24))));
                if (!z2 && dCheckedArcCos > 0.0d) {
                    dCheckedArcCos -= 6.283185307179586d;
                } else if (z2 && dCheckedArcCos < 0.0d) {
                    dCheckedArcCos += 6.283185307179586d;
                }
                float[] fArrArcToBeziers = arcToBeziers(dAcos % 6.283185307179586d, dCheckedArcCos % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f9, f10);
                matrix.postRotate(f5);
                matrix.postTranslate((float) d19, (float) d20);
                matrix.mapPoints(fArrArcToBeziers);
                fArrArcToBeziers[fArrArcToBeziers.length - 2] = f6;
                fArrArcToBeziers[fArrArcToBeziers.length - 1] = f7;
                for (int i = 0; i < fArrArcToBeziers.length; i += 6) {
                    pathInterface.cubicTo(fArrArcToBeziers[i], fArrArcToBeziers[i + 1], fArrArcToBeziers[i + 2], fArrArcToBeziers[i + 3], fArrArcToBeziers[i + 4], fArrArcToBeziers[i + 5]);
                }
                return;
            }
            pathInterface2 = pathInterface;
            f8 = f6;
        }
        pathInterface2.lineTo(f8, f7);
    }

    public static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    public static float[] arcToBeziers(double d, double d2) {
        int iCeil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / iCeil;
        double d4 = d3 / 2.0d;
        double dSin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i = 0;
        int i2 = 0;
        while (i < iCeil) {
            double d5 = d + (i * d3);
            double dCos = Math.cos(d5);
            double dSin2 = Math.sin(d5);
            double d6 = d3;
            fArr[i2] = (float) (dCos - (dSin * dSin2));
            fArr[i2 + 1] = (float) (dSin2 + (dCos * dSin));
            double d7 = d5 + d6;
            double dCos2 = Math.cos(d7);
            double dSin3 = Math.sin(d7);
            fArr[i2 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr[i2 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i3 = i2 + 5;
            fArr[i2 + 4] = (float) dCos2;
            i2 += 6;
            fArr[i3] = (float) dSin3;
            i++;
            d3 = d6;
        }
        return fArr;
    }

    public class MarkerVector {

        /* renamed from: dx */
        public float f587dx;

        /* renamed from: dy */
        public float f588dy;
        public boolean isAmbiguous = false;

        /* renamed from: x */
        public float f589x;

        /* renamed from: y */
        public float f590y;

        public MarkerVector(float f, float f2, float f3, float f4) {
            this.f587dx = 0.0f;
            this.f588dy = 0.0f;
            this.f589x = f;
            this.f590y = f2;
            double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != 0.0d) {
                this.f587dx = (float) (f3 / dSqrt);
                this.f588dy = (float) (f4 / dSqrt);
            }
        }

        public void add(float f, float f2) {
            float f3 = f - this.f589x;
            float f4 = f2 - this.f590y;
            double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != 0.0d) {
                f3 = (float) (f3 / dSqrt);
                f4 = (float) (f4 / dSqrt);
            }
            float f5 = this.f587dx;
            if (f3 == (-f5) && f4 == (-this.f588dy)) {
                this.isAmbiguous = true;
                this.f587dx = -f4;
                this.f588dy = f3;
            } else {
                this.f587dx = f5 + f3;
                this.f588dy += f4;
            }
        }

        public void add(MarkerVector markerVector) {
            float f = markerVector.f587dx;
            float f2 = this.f587dx;
            if (f == (-f2)) {
                float f3 = markerVector.f588dy;
                if (f3 == (-this.f588dy)) {
                    this.isAmbiguous = true;
                    this.f587dx = -f3;
                    this.f588dy = markerVector.f587dx;
                    return;
                }
            }
            this.f587dx = f2 + f;
            this.f588dy += markerVector.f588dy;
        }

        public String toString() {
            return "(" + this.f589x + "," + this.f590y + " " + this.f587dx + "," + this.f588dy + ")";
        }
    }

    /* loaded from: classes6.dex */
    public class MarkerPositionCalculator implements SVG.PathInterface {
        public boolean closepathReAdjustPending;
        public float startX;
        public float startY;
        public List<MarkerVector> markers = new ArrayList();
        public MarkerVector lastPos = null;
        public boolean startArc = false;
        public boolean normalCubic = true;
        public int subpathStartIndex = -1;

        public MarkerPositionCalculator(SVG.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
        }

        public List<MarkerVector> getMarkers() {
            return this.markers;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = SVGAndroidRenderer.this.new MarkerVector(f, f2, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void lineTo(float f, float f2) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            MarkerVector markerVector = this.lastPos;
            this.lastPos = sVGAndroidRenderer.new MarkerVector(f, f2, f - markerVector.f589x, f2 - markerVector.f590y);
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = SVGAndroidRenderer.this.new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = SVGAndroidRenderer.this.new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            MarkerVector markerVector = this.lastPos;
            SVGAndroidRenderer.arcTo(markerVector.f589x, markerVector.f590y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }
    }

    public final void renderMarkers(SVG.GraphicsElement graphicsElement) {
        SVG.Marker marker;
        SVG.Marker marker2;
        SVG.Marker marker3;
        List<MarkerVector> listCalculateMarkerPositions;
        int size;
        SVG.Style style = this.state.style;
        String str = style.markerStart;
        if (str == null && style.markerMid == null && style.markerEnd == null) {
            return;
        }
        if (str == null) {
            marker = null;
        } else {
            SVG.SvgObject svgObjectResolveIRI = graphicsElement.document.resolveIRI(str);
            if (svgObjectResolveIRI == null) {
                error("Marker reference '%s' not found", this.state.style.markerStart);
                marker = null;
            } else {
                marker = (SVG.Marker) svgObjectResolveIRI;
            }
        }
        String str2 = this.state.style.markerMid;
        if (str2 == null) {
            marker2 = null;
        } else {
            SVG.SvgObject svgObjectResolveIRI2 = graphicsElement.document.resolveIRI(str2);
            if (svgObjectResolveIRI2 == null) {
                error("Marker reference '%s' not found", this.state.style.markerMid);
                marker2 = null;
            } else {
                marker2 = (SVG.Marker) svgObjectResolveIRI2;
            }
        }
        String str3 = this.state.style.markerEnd;
        if (str3 == null) {
            marker3 = null;
        } else {
            SVG.SvgObject svgObjectResolveIRI3 = graphicsElement.document.resolveIRI(str3);
            if (svgObjectResolveIRI3 == null) {
                error("Marker reference '%s' not found", this.state.style.markerEnd);
                marker3 = null;
            } else {
                marker3 = (SVG.Marker) svgObjectResolveIRI3;
            }
        }
        if (graphicsElement instanceof SVG.Path) {
            listCalculateMarkerPositions = new MarkerPositionCalculator(((SVG.Path) graphicsElement).f554d).getMarkers();
        } else if (graphicsElement instanceof SVG.Line) {
            listCalculateMarkerPositions = calculateMarkerPositions((SVG.Line) graphicsElement);
        } else {
            listCalculateMarkerPositions = calculateMarkerPositions((SVG.PolyLine) graphicsElement);
        }
        if (listCalculateMarkerPositions == null || (size = listCalculateMarkerPositions.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.state.style;
        style2.markerEnd = null;
        style2.markerMid = null;
        style2.markerStart = null;
        if (marker != null) {
            renderMarker(marker, listCalculateMarkerPositions.get(0));
        }
        if (marker2 != null && listCalculateMarkerPositions.size() > 2) {
            MarkerVector markerVectorRealignMarkerMid = listCalculateMarkerPositions.get(0);
            MarkerVector markerVector = listCalculateMarkerPositions.get(1);
            int i = 1;
            while (i < size - 1) {
                i++;
                MarkerVector markerVector2 = listCalculateMarkerPositions.get(i);
                markerVectorRealignMarkerMid = markerVector.isAmbiguous ? realignMarkerMid(markerVectorRealignMarkerMid, markerVector, markerVector2) : markerVector;
                renderMarker(marker2, markerVectorRealignMarkerMid);
                markerVector = markerVector2;
            }
        }
        if (marker3 != null) {
            renderMarker(marker3, listCalculateMarkerPositions.get(size - 1));
        }
    }

    public final MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float fDotProduct = dotProduct(markerVector2.f587dx, markerVector2.f588dy, markerVector2.f589x - markerVector.f589x, markerVector2.f590y - markerVector.f590y);
        if (fDotProduct == 0.0f) {
            fDotProduct = dotProduct(markerVector2.f587dx, markerVector2.f588dy, markerVector3.f589x - markerVector2.f589x, markerVector3.f590y - markerVector2.f590y);
        }
        if (fDotProduct > 0.0f) {
            return markerVector2;
        }
        if (fDotProduct == 0.0f && (markerVector2.f587dx > 0.0f || markerVector2.f588dy >= 0.0f)) {
            return markerVector2;
        }
        markerVector2.f587dx = -markerVector2.f587dx;
        markerVector2.f588dy = -markerVector2.f588dy;
        return markerVector2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void renderMarker(SVG.Marker marker, MarkerVector markerVector) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        statePush();
        Float f4 = marker.orient;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = markerVector.f587dx;
            if (f6 != 0.0f || markerVector.f588dy != 0.0f) {
                fFloatValue = (float) Math.toDegrees(Math.atan2(markerVector.f588dy, f6));
            }
        } else {
            fFloatValue = marker.orient.floatValue();
        }
        float fFloatValue2 = marker.markerUnitsAreUser ? 1.0f : this.state.style.strokeWidth.floatValue(this.dpi);
        this.state = findInheritFromAncestorState(marker);
        Matrix matrix = new Matrix();
        matrix.preTranslate(markerVector.f589x, markerVector.f590y);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fFloatValue2, fFloatValue2);
        SVG.Length length = marker.refX;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = marker.refY;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Length length3 = marker.markerWidth;
        float fFloatValueX2 = length3 != null ? length3.floatValueX(this) : 3.0f;
        SVG.Length length4 = marker.markerHeight;
        float fFloatValueY2 = length4 != null ? length4.floatValueY(this) : 3.0f;
        SVG.Box box = marker.viewBox;
        if (box != null) {
            float fMax = fFloatValueX2 / box.width;
            float f7 = fFloatValueY2 / box.height;
            PreserveAspectRatio preserveAspectRatio = marker.preserveAspectRatio;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
            }
            if (!preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                fMax = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fFloatValueX) * fMax, (-fFloatValueY) * f7);
            this.canvas.concat(matrix);
            SVG.Box box2 = marker.viewBox;
            float f8 = box2.width * fMax;
            float f9 = box2.height * f7;
            int[] iArr = C66591.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment;
            switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f = (fFloatValueX2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                    break;
                case 4:
                case 5:
                case 6:
                    f = fFloatValueX2 - f8;
                    f2 = 0.0f - f;
                    break;
                default:
                    f2 = 0.0f;
                    break;
            }
            int i = iArr[preserveAspectRatio.getAlignment().ordinal()];
            if (i == 2) {
                f3 = (fFloatValueY2 - f9) / 2.0f;
                f5 = 0.0f - f3;
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(f2, f5, fFloatValueX2, fFloatValueY2);
                }
                matrix.reset();
                matrix.preScale(fMax, f7);
                this.canvas.concat(matrix);
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                    f3 = (fFloatValueY2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!this.state.style.overflow.booleanValue()) {
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    this.canvas.concat(matrix);
                }
                f3 = fFloatValueY2 - f9;
                f5 = 0.0f - f3;
                if (!this.state.style.overflow.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(fMax, f7);
                this.canvas.concat(matrix);
            }
        } else {
            matrix.preTranslate(-fFloatValueX, -fFloatValueY);
            this.canvas.concat(matrix);
            if (!this.state.style.overflow.booleanValue()) {
                setClipRect(0.0f, 0.0f, fFloatValueX2, fFloatValueY2);
            }
        }
        boolean zPushLayer = pushLayer();
        renderChildren(marker, false);
        if (zPushLayer) {
            popLayer(marker);
        }
        statePop();
    }

    public final RendererState findInheritFromAncestorState(SVG.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        return findInheritFromAncestorState(svgObject, rendererState);
    }

    public final RendererState findInheritFromAncestorState(SVG.SvgObject svgObject, RendererState rendererState) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject);
            }
            Object obj = svgObject.parent;
            if (obj == null) {
                break;
            }
            svgObject = (SVG.SvgObject) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            updateStyleForElement(rendererState, (SVG.SvgElementBase) it.next());
        }
        RendererState rendererState2 = this.state;
        rendererState.viewBox = rendererState2.viewBox;
        rendererState.viewPort = rendererState2.viewPort;
        return rendererState;
    }

    public final void checkForGradientsAndPatterns(SVG.SvgElement svgElement) {
        SVG.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVG.PaintReference) svgPaint);
        }
        SVG.SvgPaint svgPaint2 = this.state.style.stroke;
        if (svgPaint2 instanceof SVG.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVG.PaintReference) svgPaint2);
        }
    }

    public final void decodePaintReference(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        SVG.SvgObject svgObjectResolveIRI = this.document.resolveIRI(paintReference.href);
        if (svgObjectResolveIRI == null) {
            error("%s reference '%s' not found", z ? "Fill" : "Stroke", paintReference.href);
            SVG.SvgPaint svgPaint = paintReference.fallback;
            if (svgPaint != null) {
                setPaintColour(this.state, z, svgPaint);
                return;
            } else if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        if (svgObjectResolveIRI instanceof SVG.SvgLinearGradient) {
            makeLinearGradient(z, box, (SVG.SvgLinearGradient) svgObjectResolveIRI);
        } else if (svgObjectResolveIRI instanceof SVG.SvgRadialGradient) {
            makeRadialGradient(z, box, (SVG.SvgRadialGradient) svgObjectResolveIRI);
        } else if (svgObjectResolveIRI instanceof SVG.SolidColor) {
            setSolidColor(z, (SVG.SolidColor) svgObjectResolveIRI);
        }
    }

    public final void makeLinearGradient(boolean z, SVG.Box box, SVG.SvgLinearGradient svgLinearGradient) {
        float f;
        float fFloatValue;
        float f2;
        float f3;
        String str = svgLinearGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgLinearGradient, str);
        }
        Boolean bool = svgLinearGradient.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        RendererState rendererState = this.state;
        Paint paint = z ? rendererState.fillPaint : rendererState.strokePaint;
        if (z2) {
            SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
            SVG.Length length = svgLinearGradient.f564x1;
            float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = svgLinearGradient.f566y1;
            float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = svgLinearGradient.f565x2;
            float fFloatValueX2 = length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width;
            SVG.Length length4 = svgLinearGradient.f567y2;
            f3 = fFloatValueX2;
            f = fFloatValueX;
            f2 = fFloatValueY;
            fFloatValue = length4 != null ? length4.floatValueY(this) : 0.0f;
        } else {
            SVG.Length length5 = svgLinearGradient.f564x1;
            float fFloatValue2 = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length6 = svgLinearGradient.f566y1;
            float fFloatValue3 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length7 = svgLinearGradient.f565x2;
            float fFloatValue4 = length7 != null ? length7.floatValue(this, 1.0f) : 1.0f;
            SVG.Length length8 = svgLinearGradient.f567y2;
            f = fFloatValue2;
            fFloatValue = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            f2 = fFloatValue3;
            f3 = fFloatValue4;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgLinearGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgLinearGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVG.SvgObject> it = svgLinearGradient.children.iterator();
        float f4 = -1.0f;
        while (it.hasNext()) {
            SVG.Stop stop = (SVG.Stop) it.next();
            Float f5 = stop.offset;
            float fFloatValue5 = f5 != null ? f5.floatValue() : 0.0f;
            if (i == 0 || fFloatValue5 >= f4) {
                fArr[i] = fFloatValue5;
                f4 = fFloatValue5;
            } else {
                fArr[i] = f4;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            SVG.Style style = this.state.style;
            SVG.Colour colour = (SVG.Colour) style.stopColor;
            if (colour == null) {
                colour = SVG.Colour.BLACK;
            }
            iArr[i] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            i++;
            statePop();
        }
        if ((f == f3 && f2 == fFloatValue) || size == 1) {
            statePop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = svgLinearGradient.spreadMethod;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        statePop();
        LinearGradient linearGradient = new LinearGradient(f, f2, f3, fFloatValue, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    public final void makeRadialGradient(boolean z, SVG.Box box, SVG.SvgRadialGradient svgRadialGradient) {
        float f;
        float fFloatValue;
        float f2;
        String str = svgRadialGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgRadialGradient, str);
        }
        Boolean bool = svgRadialGradient.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        RendererState rendererState = this.state;
        Paint paint = z ? rendererState.fillPaint : rendererState.strokePaint;
        if (z2) {
            SVG.Length length = new SVG.Length(50.0f, SVG.Unit.percent);
            SVG.Length length2 = svgRadialGradient.f568cx;
            float fFloatValueX = length2 != null ? length2.floatValueX(this) : length.floatValueX(this);
            SVG.Length length3 = svgRadialGradient.f569cy;
            float fFloatValueY = length3 != null ? length3.floatValueY(this) : length.floatValueY(this);
            SVG.Length length4 = svgRadialGradient.f572r;
            fFloatValue = length4 != null ? length4.floatValue(this) : length.floatValue(this);
            f = fFloatValueX;
            f2 = fFloatValueY;
        } else {
            SVG.Length length5 = svgRadialGradient.f568cx;
            float fFloatValue2 = length5 != null ? length5.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length6 = svgRadialGradient.f569cy;
            float fFloatValue3 = length6 != null ? length6.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length7 = svgRadialGradient.f572r;
            f = fFloatValue2;
            fFloatValue = length7 != null ? length7.floatValue(this, 1.0f) : 0.5f;
            f2 = fFloatValue3;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgRadialGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgRadialGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVG.SvgObject> it = svgRadialGradient.children.iterator();
        float f3 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SVG.Stop stop = (SVG.Stop) it.next();
            Float f4 = stop.offset;
            float fFloatValue4 = f4 != null ? f4.floatValue() : 0.0f;
            if (i == 0 || fFloatValue4 >= f3) {
                fArr[i] = fFloatValue4;
                f3 = fFloatValue4;
            } else {
                fArr[i] = f3;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            SVG.Style style = this.state.style;
            SVG.Colour colour = (SVG.Colour) style.stopColor;
            if (colour == null) {
                colour = SVG.Colour.BLACK;
            }
            iArr[i] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            i++;
            statePop();
        }
        if (fFloatValue == 0.0f || size == 1) {
            statePop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = svgRadialGradient.spreadMethod;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        statePop();
        RadialGradient radialGradient = new RadialGradient(f, f2, fFloatValue, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    public final void fillInChainedGradientFields(SVG.GradientElement gradientElement, String str) {
        SVG.SvgObject svgObjectResolveIRI = gradientElement.document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.GradientElement gradientElement2 = (SVG.GradientElement) svgObjectResolveIRI;
        if (gradientElement.gradientUnitsAreUser == null) {
            gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
        }
        if (gradientElement.gradientTransform == null) {
            gradientElement.gradientTransform = gradientElement2.gradientTransform;
        }
        if (gradientElement.spreadMethod == null) {
            gradientElement.spreadMethod = gradientElement2.spreadMethod;
        }
        if (gradientElement.children.isEmpty()) {
            gradientElement.children = gradientElement2.children;
        }
        try {
            if (gradientElement instanceof SVG.SvgLinearGradient) {
                fillInChainedGradientFields((SVG.SvgLinearGradient) gradientElement, (SVG.SvgLinearGradient) svgObjectResolveIRI);
            } else {
                fillInChainedGradientFields((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) svgObjectResolveIRI);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = gradientElement2.href;
        if (str2 != null) {
            fillInChainedGradientFields(gradientElement, str2);
        }
    }

    public final void fillInChainedGradientFields(SVG.SvgLinearGradient svgLinearGradient, SVG.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.f564x1 == null) {
            svgLinearGradient.f564x1 = svgLinearGradient2.f564x1;
        }
        if (svgLinearGradient.f566y1 == null) {
            svgLinearGradient.f566y1 = svgLinearGradient2.f566y1;
        }
        if (svgLinearGradient.f565x2 == null) {
            svgLinearGradient.f565x2 = svgLinearGradient2.f565x2;
        }
        if (svgLinearGradient.f567y2 == null) {
            svgLinearGradient.f567y2 = svgLinearGradient2.f567y2;
        }
    }

    public final void fillInChainedGradientFields(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.f568cx == null) {
            svgRadialGradient.f568cx = svgRadialGradient2.f568cx;
        }
        if (svgRadialGradient.f569cy == null) {
            svgRadialGradient.f569cy = svgRadialGradient2.f569cy;
        }
        if (svgRadialGradient.f572r == null) {
            svgRadialGradient.f572r = svgRadialGradient2.f572r;
        }
        if (svgRadialGradient.f570fx == null) {
            svgRadialGradient.f570fx = svgRadialGradient2.f570fx;
        }
        if (svgRadialGradient.f571fy == null) {
            svgRadialGradient.f571fy = svgRadialGradient2.f571fy;
        }
    }

    public final void setSolidColor(boolean z, SVG.SolidColor solidColor) {
        if (z) {
            if (isSpecified(solidColor.baseStyle, SVG.SPECIFIED_SOLID_COLOR)) {
                RendererState rendererState = this.state;
                SVG.Style style = rendererState.style;
                SVG.SvgPaint svgPaint = solidColor.baseStyle.solidColor;
                style.fill = svgPaint;
                rendererState.hasFill = svgPaint != null;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                RendererState rendererState2 = this.state;
                setPaintColour(rendererState2, z, rendererState2.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(solidColor.baseStyle, SVG.SPECIFIED_SOLID_COLOR)) {
            RendererState rendererState3 = this.state;
            SVG.Style style2 = rendererState3.style;
            SVG.SvgPaint svgPaint2 = solidColor.baseStyle.solidColor;
            style2.stroke = svgPaint2;
            rendererState3.hasStroke = svgPaint2 != null;
        }
        if (isSpecified(solidColor.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
        }
        if (isSpecified(solidColor.baseStyle, 6442450944L)) {
            RendererState rendererState4 = this.state;
            setPaintColour(rendererState4, z, rendererState4.style.stroke);
        }
    }

    public final void checkForClipPath(SVG.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    public final void checkForClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path pathCalculateClipPath;
        if (this.state.style.clipPath == null || (pathCalculateClipPath = calculateClipPath(svgElement, box)) == null) {
            return;
        }
        this.canvas.clipPath(pathCalculateClipPath);
    }

    @TargetApi(19)
    public final Path calculateClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path pathObjectToPath;
        SVG.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (svgObjectResolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) svgObjectResolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVG.SvgElement) && (pathObjectToPath = objectToPath((SVG.SvgElement) svgObject, true)) != null) {
                path.op(pathObjectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path pathCalculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (pathCalculateClipPath != null) {
                path.op(pathCalculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = this.stateStack.pop();
        return path;
    }

    @TargetApi(19)
    public final Path objectToPath(SVG.SvgElement svgElement, boolean z) {
        Path pathMakePathAndBoundingBox;
        Path pathCalculateClipPath;
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        updateStyleForElement(rendererState, svgElement);
        if (!display() || !visible()) {
            this.state = this.stateStack.pop();
            return null;
        }
        if (svgElement instanceof SVG.Use) {
            if (!z) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(use.href);
            if (svgObjectResolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.state = this.stateStack.pop();
                return null;
            }
            if (!(svgObjectResolveIRI instanceof SVG.SvgElement)) {
                this.state = this.stateStack.pop();
                return null;
            }
            pathMakePathAndBoundingBox = objectToPath((SVG.SvgElement) svgObjectResolveIRI, false);
            if (pathMakePathAndBoundingBox == null) {
                return null;
            }
            if (use.boundingBox == null) {
                use.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
            }
            Matrix matrix = use.transform;
            if (matrix != null) {
                pathMakePathAndBoundingBox.transform(matrix);
            }
        } else if (svgElement instanceof SVG.GraphicsElement) {
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (svgElement instanceof SVG.Path) {
                pathMakePathAndBoundingBox = new PathConverter(((SVG.Path) svgElement).f554d).getPath();
                if (svgElement.boundingBox == null) {
                    svgElement.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
                }
            } else {
                pathMakePathAndBoundingBox = svgElement instanceof SVG.Rect ? makePathAndBoundingBox((SVG.Rect) svgElement) : svgElement instanceof SVG.Circle ? makePathAndBoundingBox((SVG.Circle) svgElement) : svgElement instanceof SVG.Ellipse ? makePathAndBoundingBox((SVG.Ellipse) svgElement) : svgElement instanceof SVG.PolyLine ? makePathAndBoundingBox((SVG.PolyLine) svgElement) : null;
            }
            if (pathMakePathAndBoundingBox == null) {
                return null;
            }
            if (graphicsElement.boundingBox == null) {
                graphicsElement.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
            }
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                pathMakePathAndBoundingBox.transform(matrix2);
            }
            pathMakePathAndBoundingBox.setFillType(getClipRuleFromState());
        } else if (svgElement instanceof SVG.Text) {
            SVG.Text text = (SVG.Text) svgElement;
            pathMakePathAndBoundingBox = makePathAndBoundingBox(text);
            if (pathMakePathAndBoundingBox == null) {
                return null;
            }
            Matrix matrix3 = text.transform;
            if (matrix3 != null) {
                pathMakePathAndBoundingBox.transform(matrix3);
            }
            pathMakePathAndBoundingBox.setFillType(getClipRuleFromState());
        } else {
            error("Invalid %s element found in clipPath definition", svgElement.getNodeName());
            return null;
        }
        if (this.state.style.clipPath != null && (pathCalculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) != null) {
            pathMakePathAndBoundingBox.op(pathCalculateClipPath, Path.Op.INTERSECT);
        }
        this.state = this.stateStack.pop();
        return pathMakePathAndBoundingBox;
    }

    public final void checkForClipPath_OldStyle(SVG.SvgElement svgElement, SVG.Box box) {
        SVG.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (svgObjectResolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) svgObjectResolveIRI;
        if (clipPath.children.isEmpty()) {
            this.canvas.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        if ((svgElement instanceof SVG.Group) && !z) {
            warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", svgElement.getNodeName());
            return;
        }
        clipStatePush();
        if (!z) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
            this.canvas.concat(matrix);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            this.canvas.concat(matrix2);
        }
        this.state = findInheritFromAncestorState(clipPath);
        checkForClipPath(clipPath);
        Path path = new Path();
        Iterator<SVG.SvgObject> it = clipPath.children.iterator();
        while (it.hasNext()) {
            addObjectToClip(it.next(), true, path, new Matrix());
        }
        this.canvas.clipPath(path);
        clipStatePop();
    }

    public final void addObjectToClip(SVG.SvgObject svgObject, boolean z, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (svgObject instanceof SVG.Use) {
                if (z) {
                    addObjectToClip((SVG.Use) svgObject, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVG.Path) {
                addObjectToClip((SVG.Path) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.Text) {
                addObjectToClip((SVG.Text) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.GraphicsElement) {
                addObjectToClip((SVG.GraphicsElement) svgObject, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", svgObject.toString());
            }
            clipStatePop();
        }
    }

    public final void clipStatePush() {
        CanvasLegacy.save(this.canvas, CanvasLegacy.MATRIX_SAVE_FLAG);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    public final void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    public final Path.FillType getClipRuleFromState() {
        SVG.Style.FillRule fillRule = this.state.style.clipRule;
        if (fillRule != null && fillRule == SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public final void addObjectToClip(SVG.Path path, Path path2, Matrix matrix) {
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            Matrix matrix2 = path.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path path3 = new PathConverter(path.f554d).getPath();
            if (path.boundingBox == null) {
                path.boundingBox = calculatePathBounds(path3);
            }
            checkForClipPath(path);
            path2.setFillType(getClipRuleFromState());
            path2.addPath(path3, matrix);
        }
    }

    public final void addObjectToClip(SVG.GraphicsElement graphicsElement, Path path, Matrix matrix) {
        Path pathMakePathAndBoundingBox;
        updateStyleForElement(this.state, graphicsElement);
        if (display() && visible()) {
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (graphicsElement instanceof SVG.Rect) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Rect) graphicsElement);
            } else if (graphicsElement instanceof SVG.Circle) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Circle) graphicsElement);
            } else if (graphicsElement instanceof SVG.Ellipse) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Ellipse) graphicsElement);
            } else if (!(graphicsElement instanceof SVG.PolyLine)) {
                return;
            } else {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.PolyLine) graphicsElement);
            }
            checkForClipPath(graphicsElement);
            path.setFillType(getClipRuleFromState());
            path.addPath(pathMakePathAndBoundingBox, matrix);
        }
    }

    public final void addObjectToClip(SVG.Use use, Path path, Matrix matrix) {
        updateStyleForElement(this.state, use);
        if (display() && visible()) {
            Matrix matrix2 = use.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            SVG.SvgObject svgObjectResolveIRI = use.document.resolveIRI(use.href);
            if (svgObjectResolveIRI == null) {
                error("Use reference '%s' not found", use.href);
            } else {
                checkForClipPath(use);
                addObjectToClip(svgObjectResolveIRI, false, path, matrix);
            }
        }
    }

    public final void addObjectToClip(SVG.Text text, Path path, Matrix matrix) {
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix2 = text.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List<SVG.Length> list = text.f575x;
            float fFloatValueY = 0.0f;
            float fFloatValueX = (list == null || list.size() == 0) ? 0.0f : text.f575x.get(0).floatValueX(this);
            List<SVG.Length> list2 = text.f576y;
            float fFloatValueY2 = (list2 == null || list2.size() == 0) ? 0.0f : text.f576y.get(0).floatValueY(this);
            List<SVG.Length> list3 = text.f573dx;
            float fFloatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.f573dx.get(0).floatValueX(this);
            List<SVG.Length> list4 = text.f574dy;
            if (list4 != null && list4.size() != 0) {
                fFloatValueY = text.f574dy.get(0).floatValueY(this);
            }
            if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(text);
                if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                    fCalculateTextWidth /= 2.0f;
                }
                fFloatValueX -= fCalculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fFloatValueX, fFloatValueY2);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            checkForClipPath(text);
            Path path2 = new Path();
            enumerateTextSpans(text, new PlainTextToPath(fFloatValueX + fFloatValueX2, fFloatValueY2 + fFloatValueY, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    /* loaded from: classes6.dex */
    public class PlainTextToPath extends TextProcessor {
        public Path textAsPath;

        /* renamed from: x */
        public float f593x;

        /* renamed from: y */
        public float f594y;

        public PlainTextToPath(float f, float f2, Path path) {
            super(SVGAndroidRenderer.this, null);
            this.f593x = f;
            this.f594y = f2;
            this.textAsPath = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Path path = new Path();
                SVGAndroidRenderer.this.state.fillPaint.getTextPath(str, 0, str.length(), this.f593x, this.f594y, path);
                this.textAsPath.addPath(path);
            }
            this.f593x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    public final Path makePathAndBoundingBox(SVG.Line line) {
        SVG.Length length = line.f548x1;
        float fFloatValueX = length == null ? 0.0f : length.floatValueX(this);
        SVG.Length length2 = line.f550y1;
        float fFloatValueY = length2 == null ? 0.0f : length2.floatValueY(this);
        SVG.Length length3 = line.f549x2;
        float fFloatValueX2 = length3 == null ? 0.0f : length3.floatValueX(this);
        SVG.Length length4 = line.f551y2;
        float fFloatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        if (line.boundingBox == null) {
            line.boundingBox = new SVG.Box(Math.min(fFloatValueX, fFloatValueX2), Math.min(fFloatValueY, fFloatValueY2), Math.abs(fFloatValueX2 - fFloatValueX), Math.abs(fFloatValueY2 - fFloatValueY));
        }
        Path path = new Path();
        path.moveTo(fFloatValueX, fFloatValueY);
        path.lineTo(fFloatValueX2, fFloatValueY2);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Path makePathAndBoundingBox(SVG.Rect rect) {
        float fFloatValueX;
        float fFloatValueY;
        float fMin;
        float fFloatValueX2;
        float fFloatValueY2;
        float f;
        float f2;
        Path path;
        Path path2;
        SVG.Length length = rect.f557rx;
        if (length == null && rect.f558ry == null) {
            fFloatValueX = 0.0f;
        } else if (length == null) {
            fFloatValueX = rect.f558ry.floatValueY(this);
        } else if (rect.f558ry == null) {
            fFloatValueX = length.floatValueX(this);
        } else {
            fFloatValueX = length.floatValueX(this);
            fFloatValueY = rect.f558ry.floatValueY(this);
            fMin = Math.min(fFloatValueX, rect.width.floatValueX(this) / 2.0f);
            float fMin2 = Math.min(fFloatValueY, rect.height.floatValueY(this) / 2.0f);
            SVG.Length length2 = rect.f559x;
            fFloatValueX2 = length2 == null ? length2.floatValueX(this) : 0.0f;
            SVG.Length length3 = rect.f560y;
            fFloatValueY2 = length3 == null ? length3.floatValueY(this) : 0.0f;
            float fFloatValueX3 = rect.width.floatValueX(this);
            float fFloatValueY3 = rect.height.floatValueY(this);
            if (rect.boundingBox == null) {
                rect.boundingBox = new SVG.Box(fFloatValueX2, fFloatValueY2, fFloatValueX3, fFloatValueY3);
            }
            f = fFloatValueX2 + fFloatValueX3;
            f2 = fFloatValueY2 + fFloatValueY3;
            path = new Path();
            if (fMin != 0.0f || fMin2 == 0.0f) {
                path2 = path;
                path2.moveTo(fFloatValueX2, fFloatValueY2);
                path2.lineTo(f, fFloatValueY2);
                path2.lineTo(f, f2);
                path2.lineTo(fFloatValueX2, f2);
                path2.lineTo(fFloatValueX2, fFloatValueY2);
            } else {
                float f3 = fMin * 0.5522848f;
                float f4 = 0.5522848f * fMin2;
                float f5 = fFloatValueY2 + fMin2;
                path.moveTo(fFloatValueX2, f5);
                float f6 = f5 - f4;
                float f7 = fFloatValueX2 + fMin;
                float f8 = f7 - f3;
                path.cubicTo(fFloatValueX2, f6, f8, fFloatValueY2, f7, fFloatValueY2);
                float f9 = f - fMin;
                path.lineTo(f9, fFloatValueY2);
                float f10 = f9 + f3;
                path.cubicTo(f10, fFloatValueY2, f, f6, f, f5);
                float f11 = f2 - fMin2;
                path.lineTo(f, f11);
                float f12 = f11 + f4;
                path2 = path;
                path.cubicTo(f, f12, f10, f2, f9, f2);
                path2.lineTo(f7, f2);
                path2.cubicTo(f8, f2, fFloatValueX2, f12, fFloatValueX2, f11);
                path2.lineTo(fFloatValueX2, f5);
            }
            path2.close();
            return path2;
        }
        fFloatValueY = fFloatValueX;
        fMin = Math.min(fFloatValueX, rect.width.floatValueX(this) / 2.0f);
        float fMin22 = Math.min(fFloatValueY, rect.height.floatValueY(this) / 2.0f);
        SVG.Length length22 = rect.f559x;
        if (length22 == null) {
        }
        SVG.Length length32 = rect.f560y;
        if (length32 == null) {
        }
        float fFloatValueX32 = rect.width.floatValueX(this);
        float fFloatValueY32 = rect.height.floatValueY(this);
        if (rect.boundingBox == null) {
        }
        f = fFloatValueX2 + fFloatValueX32;
        f2 = fFloatValueY2 + fFloatValueY32;
        path = new Path();
        if (fMin != 0.0f) {
            path2 = path;
            path2.moveTo(fFloatValueX2, fFloatValueY2);
            path2.lineTo(f, fFloatValueY2);
            path2.lineTo(f, f2);
            path2.lineTo(fFloatValueX2, f2);
            path2.lineTo(fFloatValueX2, fFloatValueY2);
        }
        path2.close();
        return path2;
    }

    public final Path makePathAndBoundingBox(SVG.Circle circle) {
        SVG.Length length = circle.f539cx;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = circle.f540cy;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float fFloatValue = circle.f541r.floatValue(this);
        float f = fFloatValueX - fFloatValue;
        float f2 = fFloatValueY - fFloatValue;
        float f3 = fFloatValueX + fFloatValue;
        float f4 = fFloatValueY + fFloatValue;
        if (circle.boundingBox == null) {
            float f5 = 2.0f * fFloatValue;
            circle.boundingBox = new SVG.Box(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fFloatValue;
        Path path = new Path();
        path.moveTo(fFloatValueX, f2);
        float f7 = fFloatValueX + f6;
        float f8 = fFloatValueY - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fFloatValueY);
        float f9 = fFloatValueY + f6;
        path.cubicTo(f3, f9, f7, f4, fFloatValueX, f4);
        float f10 = fFloatValueX - f6;
        path.cubicTo(f10, f4, f, f9, f, fFloatValueY);
        path.cubicTo(f, f8, f10, f2, fFloatValueX, f2);
        path.close();
        return path;
    }

    public final Path makePathAndBoundingBox(SVG.Ellipse ellipse) {
        SVG.Length length = ellipse.f542cx;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = ellipse.f543cy;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float fFloatValueX2 = ellipse.f544rx.floatValueX(this);
        float fFloatValueY2 = ellipse.f545ry.floatValueY(this);
        float f = fFloatValueX - fFloatValueX2;
        float f2 = fFloatValueY - fFloatValueY2;
        float f3 = fFloatValueX + fFloatValueX2;
        float f4 = fFloatValueY + fFloatValueY2;
        if (ellipse.boundingBox == null) {
            ellipse.boundingBox = new SVG.Box(f, f2, fFloatValueX2 * 2.0f, 2.0f * fFloatValueY2);
        }
        float f5 = fFloatValueX2 * 0.5522848f;
        float f6 = 0.5522848f * fFloatValueY2;
        Path path = new Path();
        path.moveTo(fFloatValueX, f2);
        float f7 = fFloatValueX + f5;
        float f8 = fFloatValueY - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fFloatValueY);
        float f9 = f6 + fFloatValueY;
        path.cubicTo(f3, f9, f7, f4, fFloatValueX, f4);
        float f10 = fFloatValueX - f5;
        path.cubicTo(f10, f4, f, f9, f, fFloatValueY);
        path.cubicTo(f, f8, f10, f2, fFloatValueX, f2);
        path.close();
        return path;
    }

    public final Path makePathAndBoundingBox(SVG.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.points;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = polyLine.points;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    public final Path makePathAndBoundingBox(SVG.Text text) {
        List<SVG.Length> list = text.f575x;
        float fFloatValueY = 0.0f;
        float fFloatValueX = (list == null || list.size() == 0) ? 0.0f : text.f575x.get(0).floatValueX(this);
        List<SVG.Length> list2 = text.f576y;
        float fFloatValueY2 = (list2 == null || list2.size() == 0) ? 0.0f : text.f576y.get(0).floatValueY(this);
        List<SVG.Length> list3 = text.f573dx;
        float fFloatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.f573dx.get(0).floatValueX(this);
        List<SVG.Length> list4 = text.f574dy;
        if (list4 != null && list4.size() != 0) {
            fFloatValueY = text.f574dy.get(0).floatValueY(this);
        }
        if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
            float fCalculateTextWidth = calculateTextWidth(text);
            if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                fCalculateTextWidth /= 2.0f;
            }
            fFloatValueX -= fCalculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fFloatValueX, fFloatValueY2);
            enumerateTextSpans(text, textBoundsCalculator);
            RectF rectF = textBoundsCalculator.bbox;
            text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(fFloatValueX + fFloatValueX2, fFloatValueY2 + fFloatValueY, path));
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f6 A[LOOP:3: B:100:0x01f0->B:102:0x01f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fillWithPattern(SVG.SvgElement svgElement, Path path, SVG.Pattern pattern) {
        float fFloatValueX;
        float fFloatValueY;
        float fFloatValueY2;
        float fFloatValueX2;
        PreserveAspectRatio preserveAspectRatio;
        boolean z;
        boolean z2;
        PreserveAspectRatio preserveAspectRatio2;
        Iterator<SVG.SvgObject> it;
        Boolean bool = pattern.patternUnitsAreUser;
        boolean z3 = bool != null && bool.booleanValue();
        String str = pattern.href;
        if (str != null) {
            fillInChainedPatternFields(pattern, str);
        }
        if (z3) {
            SVG.Length length = pattern.f555x;
            fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = pattern.f556y;
            fFloatValueY2 = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = pattern.width;
            fFloatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVG.Length length4 = pattern.height;
            fFloatValueY = length4 != null ? length4.floatValueY(this) : 0.0f;
        } else {
            SVG.Length length5 = pattern.f555x;
            float fFloatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length6 = pattern.f556y;
            float fFloatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length7 = pattern.width;
            float fFloatValue3 = length7 != null ? length7.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length8 = pattern.height;
            float fFloatValue4 = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            SVG.Box box = svgElement.boundingBox;
            float f = box.minX;
            float f2 = box.width;
            fFloatValueX = (fFloatValue * f2) + f;
            float f3 = box.minY;
            float f4 = box.height;
            float f5 = fFloatValue3 * f2;
            fFloatValueY = fFloatValue4 * f4;
            fFloatValueY2 = (fFloatValue2 * f4) + f3;
            fFloatValueX2 = f5;
        }
        if (fFloatValueX2 == 0.0f || fFloatValueY == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio3 = pattern.preserveAspectRatio;
        if (preserveAspectRatio3 == null) {
            preserveAspectRatio3 = PreserveAspectRatio.LETTERBOX;
        }
        statePush();
        this.canvas.clipPath(path);
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        rendererState.style.overflow = Boolean.FALSE;
        this.state = findInheritFromAncestorState(pattern, rendererState);
        SVG.Box box2 = svgElement.boundingBox;
        Matrix matrix = pattern.patternTransform;
        if (matrix != null) {
            this.canvas.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (pattern.patternTransform.invert(matrix2)) {
                SVG.Box box3 = svgElement.boundingBox;
                float f6 = box3.minX;
                float f7 = box3.minY;
                float fMaxX = box3.maxX();
                SVG.Box box4 = svgElement.boundingBox;
                float f8 = box4.minY;
                float fMaxX2 = box4.maxX();
                float fMaxY = svgElement.boundingBox.maxY();
                SVG.Box box5 = svgElement.boundingBox;
                preserveAspectRatio = preserveAspectRatio3;
                float[] fArr = {f6, f7, fMaxX, f8, fMaxX2, fMaxY, box5.minX, box5.maxY()};
                matrix2.mapPoints(fArr);
                z2 = false;
                float f9 = fArr[0];
                float f10 = fArr[1];
                RectF rectF = new RectF(f9, f10, f9, f10);
                for (int i = 2; i <= 6; i += 2) {
                    float f11 = fArr[i];
                    if (f11 < rectF.left) {
                        rectF.left = f11;
                    }
                    if (f11 > rectF.right) {
                        rectF.right = f11;
                    }
                    float f12 = fArr[i + 1];
                    if (f12 < rectF.top) {
                        rectF.top = f12;
                    }
                    if (f12 > rectF.bottom) {
                        rectF.bottom = f12;
                    }
                }
                z = true;
                float f13 = rectF.left;
                float f14 = rectF.top;
                box2 = new SVG.Box(f13, f14, rectF.right - f13, rectF.bottom - f14);
            } else {
                preserveAspectRatio = preserveAspectRatio3;
                z = true;
                z2 = false;
            }
        }
        float fFloor = fFloatValueX + (((float) Math.floor((box2.minX - fFloatValueX) / fFloatValueX2)) * fFloatValueX2);
        float fFloor2 = fFloatValueY2 + (((float) Math.floor((box2.minY - fFloatValueY2) / fFloatValueY)) * fFloatValueY);
        float fMaxX3 = box2.maxX();
        float fMaxY2 = box2.maxY();
        SVG.Box box6 = new SVG.Box(0.0f, 0.0f, fFloatValueX2, fFloatValueY);
        boolean zPushLayer = pushLayer();
        while (fFloor2 < fMaxY2) {
            float f15 = fFloor;
            while (f15 < fMaxX3) {
                box6.minX = f15;
                box6.minY = fFloor2;
                statePush();
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(box6.minX, box6.minY, box6.width, box6.height);
                }
                SVG.Box box7 = pattern.viewBox;
                if (box7 != null) {
                    preserveAspectRatio2 = preserveAspectRatio;
                    this.canvas.concat(calculateViewBoxTransform(box6, box7, preserveAspectRatio2));
                } else {
                    preserveAspectRatio2 = preserveAspectRatio;
                    Boolean bool2 = pattern.patternContentUnitsAreUser;
                    boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                    this.canvas.translate(f15, fFloor2);
                    if (!z4) {
                        Canvas canvas = this.canvas;
                        SVG.Box box8 = svgElement.boundingBox;
                        canvas.scale(box8.width, box8.height);
                    }
                    it = pattern.children.iterator();
                    while (it.hasNext()) {
                        render(it.next());
                    }
                    statePop();
                    f15 += fFloatValueX2;
                    preserveAspectRatio = preserveAspectRatio2;
                    z = true;
                }
                it = pattern.children.iterator();
                while (it.hasNext()) {
                }
                statePop();
                f15 += fFloatValueX2;
                preserveAspectRatio = preserveAspectRatio2;
                z = true;
            }
            fFloor2 += fFloatValueY;
            z = true;
        }
        if (zPushLayer) {
            popLayer(pattern);
        }
        statePop();
    }

    public final void fillInChainedPatternFields(SVG.Pattern pattern, String str) {
        SVG.SvgObject svgObjectResolveIRI = pattern.document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.Pattern pattern2 = (SVG.Pattern) svgObjectResolveIRI;
        if (pattern.patternUnitsAreUser == null) {
            pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
        }
        if (pattern.patternContentUnitsAreUser == null) {
            pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
        }
        if (pattern.patternTransform == null) {
            pattern.patternTransform = pattern2.patternTransform;
        }
        if (pattern.f555x == null) {
            pattern.f555x = pattern2.f555x;
        }
        if (pattern.f556y == null) {
            pattern.f556y = pattern2.f556y;
        }
        if (pattern.width == null) {
            pattern.width = pattern2.width;
        }
        if (pattern.height == null) {
            pattern.height = pattern2.height;
        }
        if (pattern.children.isEmpty()) {
            pattern.children = pattern2.children;
        }
        if (pattern.viewBox == null) {
            pattern.viewBox = pattern2.viewBox;
        }
        if (pattern.preserveAspectRatio == null) {
            pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
        }
        String str2 = pattern2.href;
        if (str2 != null) {
            fillInChainedPatternFields(pattern, str2);
        }
    }

    public final void renderMask(SVG.Mask mask, SVG.SvgElement svgElement, SVG.Box box) {
        float fFloatValueX;
        float fFloatValueY;
        debug("Mask render", new Object[0]);
        Boolean bool = mask.maskUnitsAreUser;
        if (bool != null && bool.booleanValue()) {
            SVG.Length length = mask.width;
            fFloatValueX = length != null ? length.floatValueX(this) : box.width;
            SVG.Length length2 = mask.height;
            fFloatValueY = length2 != null ? length2.floatValueY(this) : box.height;
        } else {
            SVG.Length length3 = mask.width;
            float fFloatValue = length3 != null ? length3.floatValue(this, 1.0f) : 1.2f;
            SVG.Length length4 = mask.height;
            float fFloatValue2 = length4 != null ? length4.floatValue(this, 1.0f) : 1.2f;
            fFloatValueX = fFloatValue * box.width;
            fFloatValueY = fFloatValue2 * box.height;
        }
        if (fFloatValueX == 0.0f || fFloatValueY == 0.0f) {
            return;
        }
        statePush();
        RendererState rendererStateFindInheritFromAncestorState = findInheritFromAncestorState(mask);
        this.state = rendererStateFindInheritFromAncestorState;
        rendererStateFindInheritFromAncestorState.style.opacity = Float.valueOf(1.0f);
        boolean zPushLayer = pushLayer();
        this.canvas.save();
        Boolean bool2 = mask.maskContentUnitsAreUser;
        if (bool2 != null && !bool2.booleanValue()) {
            this.canvas.translate(box.minX, box.minY);
            this.canvas.scale(box.width, box.height);
        }
        renderChildren(mask, false);
        this.canvas.restore();
        if (zPushLayer) {
            popLayer(svgElement, box);
        }
        statePop();
    }
}
