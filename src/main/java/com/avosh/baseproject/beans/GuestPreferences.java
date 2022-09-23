/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
package com.avosh.baseproject.beans;

import com.avosh.baseproject.util.Empty;
import org.springframework.context.annotation.Scope;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.*;

@Component
@Scope("session")
public class GuestPreferences implements Serializable {

    LinkedHashMap<String, Object> countries;
    private String locale;
    private String captchaLocail;

    private String theme = "blue";

    private String layout = "light";

    private String menuMode = "menu-layout-static";

    private String inputStyle = "outlined";

    private String menuColor = "dark";

    private List<Theme> themes;

    private List<Layout> layouts;

    private String themePath;

    @PostConstruct
    public void init() {
        themes = new ArrayList<>();
        themes.add(new Theme("Blue", "blue", "#2196F3"));
        themes.add(new Theme("Green", "green", "#4CAF50"));
        themes.add(new Theme("Orange", "orange", "#FFC107"));
        themes.add(new Theme("Purple", "purple", "#9C27B0"));

        layouts = new ArrayList<>();
        layouts.add(new Layout("Blue", "blue", "#0388e5"));
        layouts.add(new Layout("Light", "light", "#ffffff"));
        layouts.add(new Layout("Dark", "dark", "#4d5058"));

        countries = new LinkedHashMap<String, Object>();
        countries.put("English", Locale.ENGLISH);
        countries.put("Farsi", (new Locale("fa")));


        if (FacesContext.getCurrentInstance()
                .getViewRoot().getLocale().equals("fa")) {
            themePath = "custom-rtl.css";
            FacesContext.getCurrentInstance()
                    .getViewRoot().setLocale(new Locale("fa"));
        } else {
            themePath = "custom-ltr.css";
        }
    }


    public void changeLanguage(ValueChangeEvent e) {
        String newLocaleValue = e.getNewValue().toString();
        for (Map.Entry<String, Object> entry : countries.entrySet()) {

            if (entry.getValue().toString().equals(newLocaleValue)) {
                FacesContext.getCurrentInstance()
                        .getViewRoot().setLocale((Locale) entry.getValue());
                if (newLocaleValue.equals("fa")) {
                    themePath = "custom-rtl.css";
                    captchaLocail= "fa";
                    FacesContext.getCurrentInstance()
                            .getViewRoot().setLocale(new Locale("fa"));
                } else {
                    themePath = "custom-ltr.css";
                    captchaLocail= "en";
                }
            }
        }
    }

    public String getThemePath() {
        if (Empty.isNotEmpty(locale)) {
            if (locale.equals("fa")) {
                themePath = "custom-rtl.css";
                captchaLocail= "fa";
                FacesContext.getCurrentInstance()
                        .getViewRoot().setLocale(new Locale("fa"));
            }
        }
        return themePath;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getMenuMode() {
        return menuMode;
    }

    public void setMenuMode(String menuMode) {
        this.menuMode = menuMode;
    }

    public String getInputStyleClass() {
        return this.inputStyle.equals("filled") ? "ui-input-filled" : "";
    }

    public String getInputStyle() {
        return inputStyle;
    }

    public void setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
    }

    public String getMenuColor() {
        return menuColor;
    }

    public void setMenuColor(String menuColor) {
        this.menuColor = menuColor;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    public List<Layout> getLayouts() {
        return layouts;
    }

    public void setLayouts(List<Layout> layouts) {
        this.layouts = layouts;
    }

    public class Theme {

        private String name;

        private String file;

        private String color;

        public Theme() {
        }

        public Theme(String name, String file, String color) {
            this.name = name;
            this.file = file;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public class Layout {

        private String name;

        private String file;

        private String color;

        public Layout() {
        }

        public Layout(String name, String file, String color) {
            this.name = name;
            this.file = file;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public LinkedHashMap<String, Object> getCountries() {
        return countries;
    }

    public void setCountries(LinkedHashMap<String, Object> countries) {
        this.countries = countries;
    }

    public String getCaptchaLocail() {
        return captchaLocail;
    }
}
