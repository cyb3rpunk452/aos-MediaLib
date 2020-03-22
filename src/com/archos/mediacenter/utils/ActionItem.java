// Copyright 2017 Archos SA
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.archos.mediacenter.utils;

import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;


/**
 * Action item, displayed as menu with icon and text.
 * 
 */
    public class ActionItem {
    private Drawable icon;
    private String title;
    private OnClickListener listener;

    /**
        * Constructor
        */
    public ActionItem() {}

    /**
        * Constructor
        * 
        * @param icon {@link Drawable} action icon
        */
    public ActionItem(Drawable icon) {
        this.icon = icon;
    }

    /**
        * Set action title
        * 
        * @param title action title
        */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
        * Get action title
        * 
        * @return action title
        */
    public String getTitle() {
        return this.title;
    }

    /**
        * Set action icon
        * 
        * @param icon {@link Drawable} action icon
        */
    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    /**
        * Get action icon
        * @return  {@link Drawable} action icon
        */
    public Drawable getIcon() {
        return this.icon;
    }

    /**
        * Set on click listener
        * 
        * @param listener on click listener {@link View.OnClickListener}
        */
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    /**
        * Get on click listener
        * 
        * @return on click listener {@link View.OnClickListener}
        */
    public OnClickListener getListener() {
        return this.listener;
    }
}