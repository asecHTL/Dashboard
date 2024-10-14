package at.htlgkr.dashboard;

public interface IConverter<T,R> {
    R convert (T value);

}
