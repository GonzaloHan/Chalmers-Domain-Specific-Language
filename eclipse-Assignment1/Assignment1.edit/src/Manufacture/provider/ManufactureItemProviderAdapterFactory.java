/**
 */
package Manufacture.provider;

import Manufacture.util.ManufactureAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufactureItemProviderAdapterFactory extends ManufactureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufactureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.ManuSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManuSystemItemProvider manuSystemItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.ManuSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManuSystemAdapter() {
		if (manuSystemItemProvider == null) {
			manuSystemItemProvider = new ManuSystemItemProvider(this);
		}

		return manuSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.WorkPiece} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPieceItemProvider workPieceItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkPieceAdapter() {
		if (workPieceItemProvider == null) {
			workPieceItemProvider = new WorkPieceItemProvider(this);
		}

		return workPieceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.Storage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageItemProvider storageItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.Storage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStorageAdapter() {
		if (storageItemProvider == null) {
			storageItemProvider = new StorageItemProvider(this);
		}

		return storageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.HierarchyStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyStepItemProvider hierarchyStepItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.HierarchyStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHierarchyStepAdapter() {
		if (hierarchyStepItemProvider == null) {
			hierarchyStepItemProvider = new HierarchyStepItemProvider(this);
		}

		return hierarchyStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.ManuStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManuStepItemProvider manuStepItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.ManuStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManuStepAdapter() {
		if (manuStepItemProvider == null) {
			manuStepItemProvider = new ManuStepItemProvider(this);
		}

		return manuStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.TransStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransStepItemProvider transStepItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.TransStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransStepAdapter() {
		if (transStepItemProvider == null) {
			transStepItemProvider = new TransStepItemProvider(this);
		}

		return transStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.QAStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAStepItemProvider qaStepItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.QAStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQAStepAdapter() {
		if (qaStepItemProvider == null) {
			qaStepItemProvider = new QAStepItemProvider(this);
		}

		return qaStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.InputConditioner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputConditionerItemProvider inputConditionerItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.InputConditioner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputConditionerAdapter() {
		if (inputConditionerItemProvider == null) {
			inputConditionerItemProvider = new InputConditionerItemProvider(this);
		}

		return inputConditionerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.BiCon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiConItemProvider biConItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.BiCon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBiConAdapter() {
		if (biConItemProvider == null) {
			biConItemProvider = new BiConItemProvider(this);
		}

		return biConItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.UniCon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniConItemProvider uniConItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.UniCon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniConAdapter() {
		if (uniConItemProvider == null) {
			uniConItemProvider = new UniConItemProvider(this);
		}

		return uniConItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementItemProvider elementItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementAdapter() {
		if (elementItemProvider == null) {
			elementItemProvider = new ElementItemProvider(this);
		}

		return elementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.Responsible} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibleItemProvider responsibleItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.Responsible}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsibleAdapter() {
		if (responsibleItemProvider == null) {
			responsibleItemProvider = new ResponsibleItemProvider(this);
		}

		return responsibleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.WorkPieceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPieceTypeItemProvider workPieceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.WorkPieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkPieceTypeAdapter() {
		if (workPieceTypeItemProvider == null) {
			workPieceTypeItemProvider = new WorkPieceTypeItemProvider(this);
		}

		return workPieceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.OutPutWorkPiece} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPutWorkPieceItemProvider outPutWorkPieceItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.OutPutWorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutPutWorkPieceAdapter() {
		if (outPutWorkPieceItemProvider == null) {
			outPutWorkPieceItemProvider = new OutPutWorkPieceItemProvider(this);
		}

		return outPutWorkPieceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link Manufacture.InputWorkPiece} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputWorkPieceItemProvider inputWorkPieceItemProvider;

	/**
	 * This creates an adapter for a {@link Manufacture.InputWorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputWorkPieceAdapter() {
		if (inputWorkPieceItemProvider == null) {
			inputWorkPieceItemProvider = new InputWorkPieceItemProvider(this);
		}

		return inputWorkPieceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (manuSystemItemProvider != null) manuSystemItemProvider.dispose();
		if (stepItemProvider != null) stepItemProvider.dispose();
		if (workPieceItemProvider != null) workPieceItemProvider.dispose();
		if (storageItemProvider != null) storageItemProvider.dispose();
		if (hierarchyStepItemProvider != null) hierarchyStepItemProvider.dispose();
		if (manuStepItemProvider != null) manuStepItemProvider.dispose();
		if (transStepItemProvider != null) transStepItemProvider.dispose();
		if (qaStepItemProvider != null) qaStepItemProvider.dispose();
		if (inputConditionerItemProvider != null) inputConditionerItemProvider.dispose();
		if (biConItemProvider != null) biConItemProvider.dispose();
		if (uniConItemProvider != null) uniConItemProvider.dispose();
		if (elementItemProvider != null) elementItemProvider.dispose();
		if (responsibleItemProvider != null) responsibleItemProvider.dispose();
		if (workPieceTypeItemProvider != null) workPieceTypeItemProvider.dispose();
		if (outPutWorkPieceItemProvider != null) outPutWorkPieceItemProvider.dispose();
		if (inputWorkPieceItemProvider != null) inputWorkPieceItemProvider.dispose();
	}

}
