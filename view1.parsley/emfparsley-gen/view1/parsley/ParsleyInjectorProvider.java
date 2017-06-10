package view1.parsley;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;
import view1.parsley.ParsleyEmfParsleyGuiceModule;

@SuppressWarnings("all")
public class ParsleyInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new ParsleyEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(ParsleyInjectorProvider.class))));
    }
    return injector;
  }
}
