import lombok.Actions.Action1;

class ActionPlain {
	@java.lang.SuppressWarnings("all")
	public static lombok.Actions.Action0 testAction0() {
		return new lombok.Actions.Action0(){
			public void apply() {
				System.out.println("Action0");
			}
		};
	}

	@java.lang.SuppressWarnings("all")
	public static lombok.Actions.Action1<String> startsWith(final String _prefix) {
		return new lombok.Actions.Action1<String>(){

			public void apply(final String string) {
				string.startsWith(_prefix);
			}
		};
	}

	@java.lang.SuppressWarnings("all")
	public static lombok.Actions.Action1<java.lang.Float> sqrt() {
		return new lombok.Actions.Action1<java.lang.Float>(){

			public void apply(final java.lang.Float f) {
				Math.sqrt(f);
			}
		};
	}

	@java.lang.SuppressWarnings("all")
	public static <T>lombok.Actions.Action2<T, Action1<T>> notNull() {
		return new lombok.Actions.Action2<T, Action1<T>>(){

			public void apply(final T object, final Action1<T> notNullAction) {
				if (notNullAction == null) {
					throw new java.lang.NullPointerException(java.lang.String.format("The validated object \'%s\' (argument #%s) is null", "notNullAction", 2));
				}
				if (object != null) notNullFunction.apply(object);
			}
		};
	}

	@java.lang.SuppressWarnings("all")
	public static lombok.Actions.Action2<float[], double[]> testArrays() {
		return new lombok.Actions.Action2<float[], double[]>(){

			public void apply(final float[] a, final double[] b) {
				return;
			}
		};
	}
}