package com.reprezen.kaizen.oasparser.ovl3;

import com.reprezen.kaizen.oasparser.jsonoverlay.ObjectOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.JsonOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ChildMapOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ChildListOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ReferenceRegistry;
import com.reprezen.kaizen.oasparser.jsonoverlay.ListOverlay;
import com.reprezen.kaizen.oasparser.model3.License;
import java.util.Collection;
import java.util.stream.Collectors;
import com.reprezen.kaizen.oasparser.model3.*;
import com.reprezen.kaizen.oasparser.jsonoverlay.MapOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.ChildOverlay;
import javax.annotation.Generated;
import com.reprezen.kaizen.oasparser.jsonoverlay.PropertiesOverlay;
import com.fasterxml.jackson.core.JsonPointer;
import com.reprezen.kaizen.oasparser.ovl3.ContactImpl;
import java.util.Map;
import com.reprezen.kaizen.oasparser.jsonoverlay.OverlayFactory;
import com.reprezen.kaizen.oasparser.ovl3.LicenseImpl;
import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.kaizen.oasparser.jsonoverlay.IJsonOverlay;
import com.reprezen.kaizen.oasparser.model3.Contact;
import com.reprezen.kaizen.oasparser.jsonoverlay.StringOverlay;

public class InfoImpl extends PropertiesOverlay<Info> implements Info {

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public InfoImpl(JsonNode json, JsonOverlay<?> parent, ReferenceRegistry refReg) {
        super(json, parent, refReg);
        super.maybeElaborateChildrenAtCreation();
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public InfoImpl(Info info, JsonOverlay<?> parent, ReferenceRegistry refReg) {
        super(info, parent, refReg);
        super.maybeElaborateChildrenAtCreation();
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<String> title;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<String> description;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<String> termsOfService;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<Contact> contact;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<License> license;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildOverlay<String> version;

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ChildMapOverlay<Object> extensions;

    // Title
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getTitle() {
        return title.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getTitle(boolean elaborate) {
        return title.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setTitle(String title) {
        this.title.set(title);
    }

    // Description
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getDescription() {
        return description.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getDescription(boolean elaborate) {
        return description.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setDescription(String description) {
        this.description.set(description);
    }

    // TermsOfService
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getTermsOfService() {
        return termsOfService.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getTermsOfService(boolean elaborate) {
        return termsOfService.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setTermsOfService(String termsOfService) {
        this.termsOfService.set(termsOfService);
    }

    // Contact
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Contact getContact() {
        return contact.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Contact getContact(boolean elaborate) {
        return contact.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setContact(Contact contact) {
        this.contact.set(contact);
    }

    // License
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public License getLicense() {
        return license.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public License getLicense(boolean elaborate) {
        return license.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setLicense(License license) {
        this.license.set(license);
    }

    // Version
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getVersion() {
        return version.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getVersion(boolean elaborate) {
        return version.get(elaborate);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setVersion(String version) {
        this.version.set(version);
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
        title = createChild("title", this, StringOverlay.factory);
        description = createChild("description", this, StringOverlay.factory);
        termsOfService = createChild("termsOfService", this, StringOverlay.factory);
        contact = createChild("contact", this, ContactImpl.factory);
        license = createChild("license", this, LicenseImpl.factory);
        version = createChild("version", this, StringOverlay.factory);
        extensions = createChildMap("", this, ObjectOverlay.factory, "x-.+");
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public static OverlayFactory<Info> factory = new OverlayFactory<Info>() {

        @Override
        protected Class<? extends IJsonOverlay<? super Info>> getOverlayClass() {
            return InfoImpl.class;
        }

        @Override
        public JsonOverlay<Info> _create(Info info, JsonOverlay<?> parent, ReferenceRegistry refReg) {
            Class<? extends Info> subtype = getSubtypeOf(info);
            IJsonOverlay<?> overlay;
            if (subtype == null || subtype == Info.class) {
                overlay = new InfoImpl(info, parent, refReg);
            } else {
                switch(subtype.getSimpleName()) {
                    default:
                        overlay = null;
                }
            }
            @SuppressWarnings("unchecked") JsonOverlay<Info> castOverlay = (JsonOverlay<Info>) overlay;
            return castOverlay;
        }

        @Override
        public JsonOverlay<Info> _create(JsonNode json, JsonOverlay<?> parent, ReferenceRegistry refReg) {
            Class<? extends Info> subtype = getSubtypeOf(json);
            IJsonOverlay<?> overlay;
            if (subtype == null || subtype == Info.class) {
                overlay = new InfoImpl(json, parent, refReg);
            } else {
                switch(subtype.getSimpleName()) {
                    default:
                        overlay = null;
                }
            }
            @SuppressWarnings("unchecked") JsonOverlay<Info> castOverlay = (JsonOverlay<Info>) overlay;
            return castOverlay;
        }
    };

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private static Class<? extends Info> getSubtypeOf(Info info) {
        return Info.class;
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private static Class<? extends Info> getSubtypeOf(JsonNode json) {
        return Info.class;
    }
}
