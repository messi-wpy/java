import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
public class Rxjava2 {
    private final  static  String TAG="rxjava2";
    public static void main(String[] args){
        Observable.create(new ObservableOnSubscribe< String >() {
            @Override
            public void subscribe(ObservableEmitter< String > e) throws Exception {
                e.onNext("chan");
                e.onNext("ze");
                e.onNext("de");
                e.onError(new Exception("502"));
                e.onNext("haha");
            }
        })
                .retryWhen(new Function< Observable < Throwable > , ObservableSource<? >>() {
                    @Override
                    public ObservableSource <? > apply(Observable < Throwable > throwableObservable) throws Exception {
                        return throwableObservable.flatMap(new Function < Throwable, ObservableSource <? >> () {
                            @Override
                            public ObservableSource <? > apply(Throwable throwable) throws Exception {
                                if(!throwable.toString().equals("java.lang.Exception: 404")) {
                                    return Observable.just("可以忽略的异常");
                                } else {
                                    return Observable.error(new Throwable("终止啦"));
                                }
                            }
                        });
                    }
                })
                .subscribe(new Observer< String >() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.print( "==================onSubscribe/n ");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.print("==================onNext " + s+'\n');
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.print("==================onError " + e.toString()+"\n");
                    }

                    @Override
                    public void onComplete() {
                        System.out.print( "==================onComplete "+'\n');
                    }
                });


    }
}
