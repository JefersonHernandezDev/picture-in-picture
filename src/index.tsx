import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-picture-in-picture' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo managed workflow\n';

const PictureInPicture = NativeModules.PictureInPicture
  ? NativeModules.PictureInPicture
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function multiply(a: number, b: number): Promise<number> {
  return PictureInPicture.multiply(a, b);
}
