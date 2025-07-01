import { IDemandeXRM, NewDemandeXRM } from './demande-xrm.model';

export const sampleWithRequiredData: IDemandeXRM = {
  id: 23981,
};

export const sampleWithPartialData: IDemandeXRM = {
  id: 16355,
  aI: 'TRAITE',
};

export const sampleWithFullData: IDemandeXRM = {
  id: 16434,
  aI: 'RECU',
  iVS: 'RECU',
};

export const sampleWithNewData: NewDemandeXRM = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
