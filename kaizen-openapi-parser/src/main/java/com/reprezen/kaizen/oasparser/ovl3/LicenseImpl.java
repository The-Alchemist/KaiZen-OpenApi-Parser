package com.reprezen.kaizen.oasparser.ovl3;

import com.reprezen.kaizen.oasparser.jsonoverlay.ObjectOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.JsonOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ChildMapOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ChildListOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ReferenceRegistry;
import com.reprezen.kaizen.oasparser.jsonoverlay.ListOverlay;
import java.util.Collection;
import java.util.stream.Collectors;
import com.reprezen.kaizen.oasparser.model3.*;
import com.reprezen.kaizen.oasparser.jsonoverlay.MapOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ChildOverlay;
import javax.annotation.Generated;
import com.reprezen.kaizen.oasparser.jsonoverlay.PropertiesOverlay;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Map;
import com.reprezen.kaizen.oasparser.jsonoverlay.OverlayFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.kaizen.oasparser.jsonoverlay.IJsonOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.StringOverlay;

public class LicenseImpl extends PropertiesOverlay<License> implements License {

    JsonNode initJson = jsonMissing();

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public LicenseImpl(JsonNode json, JsonOverlay<?> parent, ReferenceRegistry refReg) {
        super(json, parent, refReg);
        super.maybeElaborateChildrenAtCreation();
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public LicenseImpl(License license, JsonOverlay<?> parent, ReferenceRegistry refReg) {
        super(license, parent, refReg);
        super.maybeElaborateChildrenAtCreation();
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<String> name;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<String> url;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildMapOverlay<Object> extensions;

    // Name
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getName() {
        return name.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getName(boolean elaborate) {
        return name.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setName(String name) {
        this.name.set(name);
    }

    // Url
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getUrl() {
        return url.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getUrl(boolean elaborate) {
        return url.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setUrl(String url) {
        this.url.set(url);
    }

    // Extension
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Map<String, Object> getExtensions() {
        return extensions.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Map<String, Object> getExtensions(boolean elaborate) {
        return extensions.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public boolean hasExtension(String name) {
        return extensions.containsKey(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Object getExtension(String name) {
        return extensions.get(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setExtensions(Map<String, Object> extensions) {
        this.extensions.set(extensions);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setExtension(String name, Object extension) {
        extensions.set(name, extension);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void removeExtension(String name) {
        extensions.remove(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    protected void elaborateChildren() {
        super.elaborateChildren();
        name = createChild("name", this, StringOverlay.factory);
        url = createChild("url", this, StringOverlay.factory);
        extensions = createChildMap("", this, ObjectOverlay.factory, "x-.+");
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public static OverlayFactory<License> factory = new OverlayFactory<License>() {

        @Override
        protected Class<? extends IJsonOverlay<? super License>> getOverlayClass() {
            return LicenseImpl.class;
        }

        @Override
        public JsonOverlay<License> _create(License license, JsonOverlay<?> parent, ReferenceRegistry refReg) {
            Class<? extends License> subtype = getSubtypeOf(license);
            IJsonOverlay<?> overlay;
            if (subtype == null || subtype == License.class) {
                overlay = new LicenseImpl(license, parent, refReg);
            } else {
                switch(subtype.getSimpleName()) {
                    default:
                        overlay = null;
                }
            }
            @SuppressWarnings("unchecked") JsonOverlay<License> castOverlay = (JsonOverlay<License>) overlay;
            return castOverlay;
        }

        @Override
        public JsonOverlay<License> _create(JsonNode json, JsonOverlay<?> parent, ReferenceRegistry refReg) {
            Class<? extends License> subtype = getSubtypeOf(json);
            IJsonOverlay<?> overlay;
            if (subtype == null || subtype == License.class) {
                overlay = new LicenseImpl(json, parent, refReg);
            } else {
                switch(subtype.getSimpleName()) {
                    default:
                        overlay = null;
                }
            }
            @SuppressWarnings("unchecked") JsonOverlay<License> castOverlay = (JsonOverlay<License>) overlay;
            return castOverlay;
        }
    };

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private static Class<? extends License> getSubtypeOf(License license) {
        return License.class;
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private static Class<? extends License> getSubtypeOf(JsonNode json) {
        return License.class;
    }
}
