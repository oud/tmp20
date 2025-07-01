import dayjs from 'dayjs/esm';

import { IMiseEnGestion, NewMiseEnGestion } from './mise-en-gestion.model';

export const sampleWithRequiredData: IMiseEnGestion = {
  id: 16315,
  typeMEG: 'cutover shrilly',
  codeOffre: 'or meanwhile whoever',
  dateEffet: dayjs('2025-07-01'),
};

export const sampleWithPartialData: IMiseEnGestion = {
  id: 2422,
  typeMEG: 'annual circulate',
  codeOffre: 'apprehensive jubilantly',
  dateEffet: dayjs('2025-06-30'),
};

export const sampleWithFullData: IMiseEnGestion = {
  id: 13488,
  typeMEG: 'eek impractical crystallize',
  codeOffre: 'pry',
  dateEffet: dayjs('2025-07-01'),
};

export const sampleWithNewData: NewMiseEnGestion = {
  typeMEG: 'why',
  codeOffre: 'so controvert',
  dateEffet: dayjs('2025-06-30'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
