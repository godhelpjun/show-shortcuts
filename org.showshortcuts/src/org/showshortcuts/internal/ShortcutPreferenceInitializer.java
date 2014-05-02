package org.showshortcuts.internal;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Initializer for shortcut visualizer preferences
 *
 * @author d031150
 */
public class ShortcutPreferenceInitializer extends AbstractPreferenceInitializer {

	public static final String PREF_KEY_SHORTCUTS_ENABLED = "enabled"; //$NON-NLS-1$
	public static final String PREF_KEY_MOUSE_TRIGGER_ENABLED = "enabled_mouseTrigger"; //$NON-NLS-1$

	public static final String PREF_KEY_TIME_TO_CLOSE = "timeToClose"; //$NON-NLS-1$
	public static final String PREF_KEY_SHOW_DESCRIPTION = "showCommandDescription"; //$NON-NLS-1$

	static final String THEME_CATEGORY = Activator.PLUGIN_ID + ".theme"; //$NON-NLS-1$

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		store.setDefault(PREF_KEY_SHORTCUTS_ENABLED, true);
		store.setDefault(PREF_KEY_MOUSE_TRIGGER_ENABLED, false);
		store.setDefault(PREF_KEY_TIME_TO_CLOSE, 5000);
		store.setDefault(PREF_KEY_SHOW_DESCRIPTION, true);
	}

}
