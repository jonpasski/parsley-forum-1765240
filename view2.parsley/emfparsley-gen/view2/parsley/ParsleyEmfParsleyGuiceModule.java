package view2.parsley;

import com.google.inject.Provider;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.domain.GlobalAdapterFactoryEditingDomainProvider;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import view2.parsley.config.ParsleyConfigurator;
import view2.parsley.resource.ParsleyResourceManager;

/**
 * view2.parsley EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ParsleyEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ParsleyEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends Provider<AdapterFactoryEditingDomain>> provideAdapterFactoryEditingDomain() {
    return GlobalAdapterFactoryEditingDomainProvider.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return ParsleyConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return ParsleyResourceManager.class;
  }
}
